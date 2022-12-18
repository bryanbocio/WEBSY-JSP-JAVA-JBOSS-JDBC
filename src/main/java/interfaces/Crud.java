package interfaces;

import java.util.List;

import models.Person;

public interface Crud {

	public List<Person> getAllPeople();
	public Person getOnePerson(int id);
	public boolean addPerson(Person person);
	public boolean editPerson(Person person);
	public boolean deletePerson(int id);
}
