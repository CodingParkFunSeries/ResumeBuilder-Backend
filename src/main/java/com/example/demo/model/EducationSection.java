package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class EducationSection implements ISection {

	private List<Education> educationList;

	public EducationSection() {
		super();
		educationList = new ArrayList<Education>();
	}

	public void addEducation(Education education) {
		educationList.add(education);
	}
	
	public void removeEducation(Education education) {
		educationList.remove(education);
	}

}
