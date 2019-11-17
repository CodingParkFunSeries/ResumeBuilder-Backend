package com.example.demo.model;

public class Education {

	private String courseName;
	private String instituteName;
	private String grade;
	private String yearOfPassing;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	@Override
	public String toString() {
		return "Education [courseName=" + courseName + ", instituteName=" + instituteName + ", grade=" + grade
				+ ", yearOfPassing=" + yearOfPassing + "]";
	}

}
