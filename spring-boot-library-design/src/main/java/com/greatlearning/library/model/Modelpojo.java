package com.greatlearning.library.model;

public class Modelpojo {

	private String name;
	private String tutor;
	private String course;

	public Modelpojo() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Modelpojo [name=" + name + ", tutor=" + tutor + ", course=" + course + "]";
	}

	public Modelpojo(String name, String tutor, String course) {
		super();
		this.name = name;
		this.tutor = tutor;
		this.course = course;
	}

}
