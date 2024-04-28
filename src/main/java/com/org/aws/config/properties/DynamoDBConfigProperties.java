package com.org.aws.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("dynamo.db")
@lombok.Value
public class DynamoDBConfigProperties
{
	String serviceEndPoint;
	String region;
	String accessKey;
	String secretKey;
}
