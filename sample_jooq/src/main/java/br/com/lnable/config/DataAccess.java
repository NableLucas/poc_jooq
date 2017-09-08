package br.com.lnable.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Bean
@ConfigurationProperties(prefix="application.properties")
public class DataAccess {

}
