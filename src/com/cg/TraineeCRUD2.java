package com.cg;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TraineeCRUD2 {
	private HashMap<Long, Trainee> trainees = new HashMap<Long, Trainee>();

	public void addTrainee(Long traineeId, String traineeName, float salary, LocalDate dateOfJoining, String email,
			String phone) {
		Trainee temp = new Trainee(traineeId, traineeName, salary, dateOfJoining, email, phone);
		trainees.put(traineeId, temp);
	}

	public void updateTrainee(Long traineeId, String traineeName, float salary, LocalDate dateOfJoining, String email,
			String phone) {
		Trainee temp = new Trainee(traineeId, traineeName, salary, dateOfJoining, email, phone);
		Set<Entry<Long, Trainee>> set = trainees.entrySet();
		for (Entry<Long, Trainee> e : set) {
			if (temp.getTraineeId() == e.getKey()) {
				e.setValue(temp);
			}
		}
	}

	public void removeTrainee(Long traineeId) {
		Set<Entry<Long, Trainee>> set = trainees.entrySet();
		for (Entry<Long, Trainee> e : set) {
			if (traineeId == e.getKey()) {
				trainees.remove(e.getKey());
			}
		}
	}

	public void getTrainee(Long traineeId) {
		Set<Entry<Long, Trainee>> set = trainees.entrySet();
		for (Entry<Long, Trainee> e : set) {
			if (traineeId == e.getKey()) {
				e.getValue().display();
			}
		}
	}

	public void display() {
		System.out.println("Trainees");
		Set<Entry<Long, Trainee>> set = trainees.entrySet();
		for (Entry<Long, Trainee> e : set) {
			e.getValue().display();
		}
	}
}
