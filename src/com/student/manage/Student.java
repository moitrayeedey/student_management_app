package com.student.manage;

public class Student {
	private int student_id;
	private String student_name;
	private String student_dept;
	private String student_hometown;
	private String student_email;
	
	//constructors
	public Student(int student_id, String student_name, String student_dept, String student_hometown,
			String student_email) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_dept = student_dept;
		this.student_hometown = student_hometown;
		this.student_email = student_email;
	}
	public Student(String student_name, String student_dept, String student_hometown, String student_email) {
		super();
		this.student_name = student_name;
		this.student_dept = student_dept;
		this.student_hometown = student_hometown;
		this.student_email = student_email;
	}
	public Student() {
		super();
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_dept() {
		return student_dept;
	}
	public void setStudent_dept(String student_dept) {
		this.student_dept = student_dept;
	}
	public String getStudent_hometown() {
		return student_hometown;
	}
	public void setStudent_hometown(String student_hometown) {
		this.student_hometown = student_hometown;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	//toString method for
	public String toString() {
		return "student [student_id=" + student_id + ", student_name=" + student_name + ", student_dept=" + student_dept
				+ ", student_hometown=" + student_hometown + ", student_email=" + student_email + "]";
	}
	
	
	
	
}
