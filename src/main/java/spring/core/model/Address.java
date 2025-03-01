package spring.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@ToString
//@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Address {

	private String city, state;
}
