package models;

public class Person {
	private int id;
	private int dni;
	private String name;
	
	
	public Person(){
		
	}
	
	public Person(int dni, String name) {
		this.dni=dni;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
