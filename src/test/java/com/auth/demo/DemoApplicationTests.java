package com.auth.demo;

import com.auth.demo.entity.Client;
import com.auth.demo.oauth.repository.AuthorityRepository;
import com.auth.demo.oauth.repository.ClientRepository;
import com.auth.demo.oauth.repository.UserRepository;
import com.auth.demo.entity.Authority;
import com.auth.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.server.authorization.settings.ClientSettings;
import org.springframework.transaction.annotation.Transactional;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

/*
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AuthorityRepository authorityRepository;
	@Autowired
	private ClientRepository clientRepository;

	@Test
	@Transactional
	void insertUser() {

		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		User user = User.builder()
				.username("sinuk")
				.password(passwordEncoder.encode("1234"))
				.authorityList(null)
				.accountNonExpired(true)
				.accountNonLocked(true)
				.credentialsNonExpired(true)
				.enabled(true)
				.build();

		Authority authority = Authority.builder()
				.authority("USER")
				.user(user)
				.build();

		user.setAuthorityList(List.of(authority));

		userRepository.save(user);
		authorityRepository.save(authority);

		assertThat(user).isNotEqualTo(null);
	}

	@Test
	void insertClient() {

		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		Client client = Client.builder()
				.clientId("123")
				.clientIdIssuedAt(Instant.now())
				.clientSecret(passwordEncoder.encode("testClient"))
				.clientSecretExpiresAt(Instant.now().plus(Duration.ofDays(365)))
				.clientName("테스트 클라이언트")
				.clientAuthenticationMethods("client_secret_basic")
				.authorizationGrantTypes("authorization_code,refresh_token")
				.redirectUris("http://localhost:3000")
				.postLogoutRedirectUris("http://localhost:3000")
				.scopes("openid,profile")
				.clientSettings(ClientSettings.builder().requireAuthorizationConsent(false).build())
				.build();

		clientRepository.save(client);

		assertThat(client).isNotEqualTo(null);
	}
*/

}
