package com.nishant.spring.springcoreadvance.stereotype.anotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Value("wipro")
	private String company;
	@Value("Dev")
	private String title;
	
	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}

}
