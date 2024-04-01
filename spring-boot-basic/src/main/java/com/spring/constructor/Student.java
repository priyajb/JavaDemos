package com.spring.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

public class Student {
	private String studentName;
	private String deptName;
	private Course course;

	// here course will be injeted using constructor
	// annotation autowired not required

	public Student(Course course) {
		super();
		this.course = course;
	}

	public String getStudentName() {
		return studentName;
	}

	@Value("${student.name}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDeptName() {
		return deptName;
	}

	@Value("${student.deptName}")
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", deptName=" + deptName + ", course=" + course + "]";
	}

}
