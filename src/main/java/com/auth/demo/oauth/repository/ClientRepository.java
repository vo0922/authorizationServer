/**
 * packageName    : com.auth.demo.oauth.repository
 * fileName       : ClientRepository
 * author         : user
 * date           : 2024-04-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-01        user       최초 생성
 **/
package com.auth.demo.oauth.repository;

import com.auth.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, String> {

    Optional<Client> findByClientId(String clientId);
}