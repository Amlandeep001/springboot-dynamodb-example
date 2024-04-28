package com.org.aws.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@DynamoDBDocument
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable
{
	private static final long serialVersionUID = -587715250991142070L;

	@DynamoDBAttribute
	String city;

	@DynamoDBAttribute
	String state;

	@DynamoDBAttribute
	long pinCode;
}
