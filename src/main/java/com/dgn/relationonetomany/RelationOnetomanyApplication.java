package com.dgn.relationonetomany;

import com.dgn.relationonetomany.model.User;
import com.dgn.relationonetomany.model.UserDetail;
import com.dgn.relationonetomany.repository.UserDetailRepository;
import com.dgn.relationonetomany.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class RelationOnetomanyApplication
		implements CommandLineRunner {

	private final UserRepository userRepository;
	private final UserDetailRepository userDetailRepository;

	public RelationOnetomanyApplication(UserRepository userRepository,
										UserDetailRepository userDetailRepository) {
		this.userRepository = userRepository;
		this.userDetailRepository = userDetailRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(RelationOnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(
				"doğan1",
				"güneş1");
		User user2 = new User(
				"doğan2",
				"güneş2");
		 User saveUser1 = userRepository.save(user1);
		 User saveUser2 = userRepository.save(user2);

		UserDetail userDetail1 = new UserDetail(
				"dgn@dgn.com",
				"123456");
		userDetail1.setUser(saveUser1);
		UserDetail userDetail2 = new UserDetail(
				"dgn2@dgn2.com",
				"654321");
		userDetail2.setUser(saveUser2);
		userDetailRepository.saveAll(Arrays.asList(
				userDetail1,userDetail2));



	}
}
