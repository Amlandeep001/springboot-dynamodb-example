package com.org.aws.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.aws.entity.Person;
import com.org.aws.repository.PersonRepository;

@RestController
public class DynamoDBDemoController
{
	private final PersonRepository repository;

	public DynamoDBDemoController(PersonRepository repository)
	{
		this.repository = repository;
	}

	@PostMapping("/savePerson")
	public Person savePerson(@RequestBody Person person)
	{
		return repository.addPerson(person);
	}

	@GetMapping("/getPerson/{personId}")
	public Person findPerson(@PathVariable String personId)
	{
		return repository.findPersonByPersonId(personId);
	}

	@DeleteMapping("/deletePerson")
	public String deletePerson(@RequestBody Person person)
	{
		return repository.deletePerson(person);
	}

	@PutMapping("/editPerson")
	public String updatePerson(@RequestBody Person person)
	{
		return repository.editPerson(person);
	}
}
