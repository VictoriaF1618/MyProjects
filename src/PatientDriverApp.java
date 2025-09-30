/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: (Give a brief description for each Class)
 * Due: 9/29/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Victoria Falade
*/

import java.util.Scanner;

/**
 * This is the driver class for the Patient and Procedure class.
 * This program asks the user for patient information and information
 * for three different procedures
 */
public class PatientDriverApp {
	
	public static void main(String[] args) {
		//Create Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get user input for patient first, middle and last name
		System.out.println("Please enter paitent information: ");
		System.out.print("First name: ");
		String firstName = keyboard.nextLine();
		System.out.print("Middle name: ");
		String middleName = keyboard.nextLine();
		System.out.print("Last name: ");
		String lastName = keyboard.nextLine();
		
		//Initialize new patient object with data obtained from user input above
		Patient patient1 = new Patient(firstName, middleName, lastName);
		
		//Sets the remaining values not initialized from patient1
		System.out.print("Patient street address: ");
		patient1.setStreetAddress(keyboard.nextLine());
		System.out.print("Patient city: ");
		patient1.setCity(keyboard.nextLine());
		System.out.print("Patient state: ");
		patient1.setState(keyboard.nextLine());
		System.out.print("Patient zip code: ");
		patient1.setZipCode(keyboard.nextInt());
		keyboard.nextLine();
		System.out.print("Patient phone number: ");
		patient1.setPhoneNum(keyboard.nextLine());
		System.out.print("Patient emergency name: ");
		patient1.setEmergencyName(keyboard.nextLine());
		System.out.print("Patient emergency phone number: ");
		patient1.setEmergencyPhoneNum(keyboard.nextLine());
		
		//Creates new procedure object with no parameters
		Procedure patientProcedure1 = new Procedure();
		
		//Set values for the patientProcedure1 object
		System.out.println("\nPlease enter procedure information: ");
		System.out.print("Procedure name: ");
		patientProcedure1.setProcedureName(keyboard.nextLine());
		System.out.print("Procedure date: ");
		patientProcedure1.setProcedureDate(keyboard.nextLine());
		System.out.print("Practitioner name: ");
		patientProcedure1.setPractitionerName(keyboard.nextLine());
		System.out.print("Procedure charge: ");
		patientProcedure1.setProcedureCharges(keyboard.nextDouble());
		keyboard.nextLine();
		
		//Create new procedure object, initialized with the 
		//procedure and procedure date parameters
		Procedure patientProcedure2 = new Procedure("Surgery", "2/3/2025");
		
		//Set remaining values not initialized from patientProcedure2
		System.out.println("\nPlease enter procedure information: ");
		System.out.print("Practitioner name: ");
		patientProcedure2.setPractitionerName(keyboard.nextLine());
		System.out.print("Procedure charge: ");
		patientProcedure2.setProcedureCharges(keyboard.nextDouble());
		keyboard.nextLine();
		
		//Create new procedure object, initialized with procedure, procedure date
		//practitioner name and procedure cost parameters
		Procedure patientProcedure3 = new Procedure("Check-up","5/10/2025", "Jane", 103.21);
		
		//Call the display methods
		displayPatient(patient1);
		displayProcedure(patientProcedure1);
		displayProcedure(patientProcedure2);
		displayProcedure(patientProcedure3);
		
		//Initialize a new totalCharges variables to hold the total charge of
		//the three procedures
		double totalCharges = calculateTotalCharges(patientProcedure1, patientProcedure2, patientProcedure3);
		System.out.printf("\nTotal Charges $%,.2f\n", totalCharges);
		
		//Output student information
		System.out.println("\nStudent Name: Victoria Falade");
		System.out.println("MC#: 21007198");
		System.out.println("Due Date: 9/29/2025");
		
		//Close scanner
		keyboard.close();
		
	}
	
	/**
	 * Calls the toString() method from the Patient class
	 * to then be displayed in the output
	 * @param patient takes an instance of the Patient class
	 */
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}
	
	/**
	 * Calls the toString() method from the procedure class
	 * to then be displayed in the output
	 * 
	 * @param procedure takes an instance of the Procedure class
	 */
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}
	
	/**
	 * Calculates the total charges from three three procedure objects
	 * by calling the getProcedureCharges() from the Procedure class
	 * 
	 * @param procedure1 takes an instance of the Procedure class
	 * @param procedure2 takes an instance of the Procedure class
	 * @param procedure3 takes an instance of the Procedure class
	 * @return the sum of the total charges
	 */
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getProcedureCharges() + 
				procedure2.getProcedureCharges() + 
				procedure3.getProcedureCharges();
	}
}
