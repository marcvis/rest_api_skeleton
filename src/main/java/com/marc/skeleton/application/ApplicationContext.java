package com.marc.skeleton.application;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@ComponentScan("com.marc.skeleton")
@EnableWebMvc
public class ApplicationContext {
} 