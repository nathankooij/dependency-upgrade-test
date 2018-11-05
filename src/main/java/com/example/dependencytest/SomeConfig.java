package com.example.dependencytest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(SomeServiceImpl.class)
@Configuration
public class SomeConfig {
}
