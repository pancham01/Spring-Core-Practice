package spring.core.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Employee {

	private int id;
	private String name, gender;
	private Address address;

	public Employee(int id, String name, String gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		System.out.println("Param-const...............");
	}

	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}

}
