package com.org.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringbootDynamodbExampleApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootDynamodbExampleApplication.class, args);
	}
}
