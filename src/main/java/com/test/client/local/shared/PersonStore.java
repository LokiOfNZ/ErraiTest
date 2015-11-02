package com.test.client.local.shared;

import java.util.ArrayList;
import java.util.List;

public class PersonStore {

	private static List<Person> people = new ArrayList<Person>();

	static {
		Person p1 = new Person();
		p1.setName("Jack");
		p1.setEmail("no email");
		p1.setAddress("Overthere");
		Person p2 = new Person();
		p2.setName("Jill");
		p2.setEmail("see jack");
		p2.setAddress("Overthere with hack");
		Person p3 = new Person();
		p3.setName("Phil");
		p3.setEmail("phil@abbey.rulez.com");
		p3.setAddress("Abbey's place");
		Person p4 = new Person();
		p4.setName("Save");
		p4.setEmail("save@me.com");
		p4.setAddress("SOS");
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
	}

	public static List<Person> getPeople() {
		return people;
	}
}
