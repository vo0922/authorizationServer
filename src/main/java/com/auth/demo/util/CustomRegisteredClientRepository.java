package com.auth.demo.util;

import com.auth.demo.entity.Client;
import com.auth.demo.oauth.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.stereotype.Component;


/**
 * packageName    : com.auth.demo.repository
 * fileName       : CustomRegisteredClientRepository
 * author         : user
 * date           : 2024-04-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-01        user       최초 생성
 **/
@Component
@RequiredArgsConstructor
public class CustomRegisteredClientRepository implements RegisteredClientRepository {

    private final ClientRepository clientRepository;
    private final ClientUtils clientUtils;

    @Override
    public void save(RegisteredClient registeredClient) {
        Client entity = clientUtils.toEntity(registeredClient);
        clientRepository.save(entity);
    }

    @Override
    public RegisteredClient findById(String id) {
        Client client = clientRepository.findById(id).orElseThrow();
        return clientUtils.toObject(client);
    }

    @Override
    public RegisteredClient findByClientId(String clientId) {
        Client client = clientRepository.findByClientId(clientId).orElseThrow();
        return clientUtils.toObject(client);
    }
}