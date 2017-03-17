package webservice;

import org.springframework.stereotype.Service;

import model.Person;

import java.util.Hashtable;

@Service
public class PersonService {
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	public PersonService(){
		Person p = new Person();
		p.setId("1");
		p.setFirstName("Manuel");
		p.setLastName("Rey");
		p.setAge(100);
		persons.put("1", p);
		
		p = new Person();
		p.setId("2");
		p.setFirstName("test");
		p.setLastName("test2");
		persons.put("2", p);
	}
	public Person getPerson(String id){
		if (persons.containsKey(id))
			return persons.get(id);
		else
			return null;
	}
	public Hashtable<String, Person> getAll(){
		return persons;
	}
}
