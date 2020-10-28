package com.cg;

import java.time.LocalDate;

public class Trainee {
	private Long traineeId;
	private String traineeName;
	private float salary;
	private LocalDate dateOfJoining;
	private String email;
	private String phone;
	
	public Trainee(Long traineeId, String traineeName, float salary, LocalDate dateOfJoining, String email,
			String phone) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.email = email;
		this.phone = phone;
	}

	public Long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void display() {
		System.out.println("------------------------------------------------------");
		System.out.println("ID: "+this.traineeId);
		System.out.println("Name: "+this.traineeName);
		System.out.println("Salary: "+this.salary);
		System.out.println("Date of joining "+this.dateOfJoining);
		System.out.println("Email: "+this.email);
		System.out.println("Phone number "+this.email);
	}
}
