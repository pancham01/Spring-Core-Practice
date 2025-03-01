package spring.core.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

	private List<Integer> list;
	private Set<Integer> set;
	private Map<Integer, String> map;

	

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

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public Employee(int id, String name, String gender, Address address, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	
	
}
