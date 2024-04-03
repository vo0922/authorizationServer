package com.auth.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * packageName    : com.auth.demo.entity
 * fileName       : User
 * author         : user
 * date           : 2024-03-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-29        user       최초 생성
 **/

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;

    @JsonIgnore
    @Builder.Default
    @OneToMany(mappedBy = "user")
    private List<Authority> authorityList = new ArrayList<>();
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean enabled;

    public List<SimpleGrantedAuthority> getSimpleAuthorities() {
        return this.authorityList.stream().map(authority -> new SimpleGrantedAuthority(authority.getAuthority())).toList();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getSimpleAuthorities();
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.getAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    public void setAuthorityList(List<Authority> authorityList) { this.authorityList = authorityList; }
}