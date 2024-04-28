package com.org.aws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.org.aws.config.properties.DynamoDBConfigProperties;

@Configuration
public class DynamoDBConfig
{
	private final DynamoDBConfigProperties configProps;

	public DynamoDBConfig(DynamoDBConfigProperties configProps)
	{
		this.configProps = configProps;
	}

	@Bean
	DynamoDBMapper mapper()
	{
		return new DynamoDBMapper(amazonDynamoDBConfig());
	}

	private AmazonDynamoDB amazonDynamoDBConfig()
	{
		return AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(configProps.getServiceEndPoint(), configProps.getRegion()))
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(configProps.getAccessKey(), configProps.getSecretKey())))
				.build();
	}
}
