package com.cg;

import java.time.LocalDate;
import java.util.Scanner;

public class TraineeManage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TraineeCRUD trainees = new TraineeCRUD();
		while (true) {
			System.out.println("======================");
			System.out.println(
					"Enter option:\n1. Add Trainee\n2. Update Trainee\n3.Remove Trainee\n4. View all trainees\n5. Search Trainee");
			int option = input.nextInt();
			long traineeId;
			float salary;
			String traineeName, date, email, phone;
			LocalDate dateofjoining;
			switch (option) {
			case 1:
				System.out.println("-------------------------------------------------");
				System.out.println("Add details for trainee");
				System.out.println("Enter Trainee Id:");
				traineeId = input.nextLong();
				System.out.println("Enter Trainee Name:");
				traineeName = input.next();
				System.out.println("Enter Trainee Salary:");
				salary = input.nextFloat();
				System.out.println("Enter Date of Joining (DD/MM/YYYY):");
				date = input.next();
				dateofjoining = LocalDate.of(Integer.parseInt(date.split("/")[2]), Integer.parseInt(date.split("/")[1]),
						Integer.parseInt(date.split("/")[0]));
				System.out.println("Enter Email address:");
				email = input.next();
				System.out.println("Enter Phone Number:");
				phone = input.next();
				trainees.addTrainee(traineeId, traineeName, salary, dateofjoining, email, phone);
				break;
			case 2:
				System.out.println("-------------------------------------------------");
				System.out.println("Update details for trainee");
				System.out.println("Enter Trainee Id:");
				traineeId = input.nextLong();
				System.out.println("Enter Trainee Name:");
				traineeName = input.next();
				System.out.println("Enter Trainee Salary:");
				salary = input.nextFloat();
				System.out.println("Enter Date of Joining (DD/MM/YYYY):");
				date = input.next();
				dateofjoining = LocalDate.of(Integer.parseInt(date.split("/")[2]), Integer.parseInt(date.split("/")[1]),
						Integer.parseInt(date.split("/")[0]));
				System.out.println("Enter Email address:");
				email = input.next();
				System.out.println("Enter Phone Number:");
				phone = input.next();
				trainees.updateTrainee(traineeId, traineeName, salary, dateofjoining, email, phone);
				break;
			case 3:
				System.out.println("-------------------------------------------------");
				System.out.println("Remove details for trainee");
				System.out.println("Enter Trainee Id:");
				traineeId = input.nextLong();
				trainees.removeTrainee(traineeId);
				break;
			case 4:
				trainees.display();
				break;
			case 5:
				System.out.println("-------------------------------------------------");
				System.out.println("Search Trainees");
				System.out.println("Enter the trainee id");
				traineeId = input.nextLong();
				trainees.getTrainee(traineeId);
				break;
			default:
				System.out.println("Invalid option selected");
			}
		}
	}

}
