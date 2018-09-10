package com.example.dependencytest;

import com.google.common.collect.ImmutableSet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyTestApplication {

	private static final ImmutableSet<String> TEST = ImmutableSet.of("TEST");

	public static void main(String[] args) {
		SpringApplication.run(DependencyTestApplication.class, args);
	}
}
