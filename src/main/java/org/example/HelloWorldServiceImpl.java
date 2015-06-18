package org.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	PersonDao dao;

	@Override
	public void add(String firstName, String lastName) {
		Person p = new Person(firstName, lastName);
		dao.save(p);
	}

	@Override
	public void greet() {
		List<Person> persons = dao.findAll();
		
		Person p = pickOne(persons);
		System.out.println("Hello, " + p.getFirstName() + " " + p.getLastName());
	}

	private Person pickOne(List<Person> persons) {
		int idx = (int) (Math.random() * persons.size());
		return persons.get(idx);
	}

}
