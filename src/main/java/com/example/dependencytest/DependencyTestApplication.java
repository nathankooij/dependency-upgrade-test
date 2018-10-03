package com.example.dependencytest;

import com.google.common.collect.ImmutableSet;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(SomeConfig.class)
@SpringBootApplication
public class DependencyTestApplication {

	private static final ImmutableSet<String> TEST = ImmutableSet.of("TEST");

	@Autowired SomeService someService;

	public static void main(String[] args) {
		SpringApplication.run(DependencyTestApplication.class, args);
	}

	@PostConstruct
	void run() {
		someService.getModels().stream().map(SomeModel::getSomeField).forEach(System.out::println);
	}
}
