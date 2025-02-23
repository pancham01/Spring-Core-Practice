package spring.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter // (value = AccessLevel.PRIVATE)
@ToString
//@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

	private int id;
	private String name, gender;

}
