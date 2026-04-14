package com.good.prototype;

public class Student implements Cloneable{
	private String name; 
	private String course; 
	private String schedule;
	public Student(String name, String course, String schedule) {
		super();
		this.name = name;
		this.course = course;
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	} 
	
	
	@Override
	public Student clone()  {
		// TODO Auto-generated method stub
		try {
			return (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public void showInfo() { 
		System.out.println("Estudiante: " + name); 
		System.out.println("Curso: " + course); 
		System.out.println("Horario: " + schedule); 
	}
}
