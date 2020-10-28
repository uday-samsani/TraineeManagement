package com.cg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class TraineeCRUD {
	private ArrayList<Trainee> trainees = new ArrayList<Trainee>();

	public void addTrainee(Long traineeId, String traineeName, float salary, LocalDate dateOfJoining, String email,
			String phone) {
		Trainee temp = new Trainee(traineeId, traineeName, salary, dateOfJoining, email, phone);
		trainees.add(temp);
	}
	
	public void updateTrainee(Long traineeId, String traineeName, float salary, LocalDate dateOfJoining, String email,
			String phone) {
		Trainee temp = new Trainee(traineeId, traineeName, salary, dateOfJoining, email, phone);
		Iterator<Trainee> itr = trainees.iterator();
		while(itr.hasNext()) {
			if(temp.getTraineeId()==itr.next().getTraineeId()) {
				itr.remove();
			}
			trainees.add(temp);
		}
	}
	
	public void removeTrainee(Long traineeId) {
		Iterator<Trainee> itr = trainees.iterator();
		while(itr.hasNext()) {
			Trainee temp = itr.next();
			if(traineeId == temp.getTraineeId()) {
				itr.remove();
			}
		}
	}
	
	public void getTrainee(Long traineeId) {
		Iterator<Trainee> itr = trainees.iterator();
		while(itr.hasNext()) {
			Trainee temp = itr.next();
			if(traineeId == temp.getTraineeId()) {
				temp.display();
			}
		}
	}
	
	public void display() {
		System.out.println("---------------------------------");
		System.out.println("Trainees");
		Iterator<Trainee> itr=trainees.iterator();
		while(itr.hasNext()) {
			itr.next().display();
		}
	}
}
