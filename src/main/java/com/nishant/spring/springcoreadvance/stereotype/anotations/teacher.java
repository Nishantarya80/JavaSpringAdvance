package com.nishant.spring.springcoreadvance.stereotype.anotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class teacher {

	@Value("10")
	private int id;
	@Value("nishant")
	private String name;
	
	@Value("#{courses}")
	private List<String> courses;
	
	@Autowired
	private Profile profile;




	@Override
	public String toString() {
		return "teacher [id=" + id + ", name=" + name + ", courses=" + courses + ", profile=" + profile + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

}
