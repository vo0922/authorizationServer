/**
 * packageName    : com.auth.demo.auth.repository
 * fileName       : AuthorityRepository
 * author         : user
 * date           : 2024-04-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-01        user       최초 생성
 **/
package com.auth.demo.oauth.repository;

import com.auth.demo.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}