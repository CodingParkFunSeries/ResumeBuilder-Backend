package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class WorkSection implements ISection {

	private List<WorkExperience> workExperiences;

	public WorkSection() {
		super();
		workExperiences = new ArrayList<WorkExperience>();
	}

	public void addExperience(WorkExperience experience) {
		workExperiences.add(experience);
	}

	public void removeWorkExperience(WorkExperience experience) {
		workExperiences.remove(experience);
	}

}
