package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Resume {

	@Id
	public ObjectId _id;

	private PersonalDetails personalDetails;
	private WorkSection workSection;
	private EducationSection educationSection;
	private List<CustomSection> customSections;

	private Resume() {
		super();
		customSections = new ArrayList<CustomSection>();
	}

	public Resume(PersonalDetails personalDetails) {
		this();

		this.personalDetails = personalDetails;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public WorkSection getWorkSection() {
		return workSection;
	}

	public void setWorkSection(WorkSection workSection) {
		this.workSection = workSection;
	}

	public EducationSection getEducationSection() {
		return educationSection;
	}

	public void setEducationSection(EducationSection educationSection) {
		this.educationSection = educationSection;
	}

	public List<CustomSection> getCustomSections() {
		return customSections;
	}

	public void addCustomSections(CustomSection customSection) {
		this.customSections.add(customSection);
	}

}
