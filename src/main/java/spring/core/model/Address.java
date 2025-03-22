package spring.core.model;

import org.springframework.stereotype.Component;

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
@Component
public class Address {

	private String city ="Shimla", state="UK";
}
