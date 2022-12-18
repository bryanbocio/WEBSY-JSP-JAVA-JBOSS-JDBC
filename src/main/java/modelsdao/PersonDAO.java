package modelsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.DBConnection;
import interfaces.Crud;
import models.Person;

public class PersonDAO implements Crud{

	DBConnection dbConnection=new DBConnection();
	Connection connection;
	PreparedStatement ps;
	ResultSet rs;
	Person person=new Person();
	public PersonDAO() {
		
	}
	
	
	@Override
	public List<Person> getAllPeople(){
		List<Person> personList=new ArrayList<>();
		String sql ="select * from person";
		connection=dbConnection.getConnection();
		try {
			ps=connection.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Person person= new Person();
				person.setId(rs.getInt("Id"));
				person.setDni(rs.getInt("Dni"));
				person.setName(rs.getString("Name"));
				personList.add(person);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return personList;
	}
	
	@Override
	public Person getOnePerson(int id) {
		throw new UnsupportedOperationException("");
	}
	
	@Override
	public boolean addPerson(Person person) {
		throw new UnsupportedOperationException("");
	}
	
	@Override
	public boolean editPerson(Person person) {
		throw new UnsupportedOperationException("");
	}
	
	@Override
	public boolean deletePerson(int id) {
		throw new UnsupportedOperationException("");
	}
}
