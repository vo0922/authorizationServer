/**
 * packageName    : com.auth.demo.auth.repository
 * fileName       : UserRepository
 * author         : user
 * date           : 2024-03-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-29        user       최초 생성
 **/
package com.auth.demo.oauth.repository;

import com.auth.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT user FROM User user JOIN FETCH user.authorityList WHERE user.username=:username")
    User findByUsername(@Param("username") String username);
}