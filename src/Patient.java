
public class Patient {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	private String phoneNum;
	private String emergencyName;
	private String emergencyPhoneNum;
	
	//Constructors
	/**
	 * Patient constructor 
	 */
	Patient(){}
	
	/**
	 * This constructor assigns Patient first, middle and last
	 * name to the assigned values
	 * 
	 * @param firstName takes users first name
	 * @param middleName takes users middle name
	 * @param lastName takes users last name
	 */
	Patient(String firstName, String middleName, String lastName){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	//Mutator methods
	/**
	 * Sets the Patient first name
	 * 
	 * @param name takes the first name
	 */
	public void setFirstName(String name) {
		firstName = name;
	}
	
	/**
	 * Sets the Patient middle name
	 * 
	 * @param name takes the middle name
	 */
	public void setMiddleName(String name) {
		middleName = name;
	}
	
	/**
	 * Sets the Patient last name
	 * 
	 * @param name takes the last name
	 */
	public void setLastName(String name) {
		lastName = name;
	}
	
	/**
	 * Sets the Patient street address
	 * 
	 * @param address takes the address
	 */
	public void setStreetAddress(String address) {
		streetAddress = address;
	}
	
	/**
	 * Sets the Patient city
	 * 
	 * @param city takes the city name
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Sets the Patient state
	 * 
	 * @param state takes the state name
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Sets the Patient zip code
	 * 
	 * @param zip takes the zip code
	 */
	public void setZipCode(int zip) {
		zipCode = zip;
	}
	
	/**
	 * Sets the Patient phone number
	 * 
	 * @param phoneNum takes the phone number
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	/**
	 * Sets the emergency contact name
	 * 
	 * @param name takes the emergency contact name
	 */
	public void setEmergencyName(String name) {
		emergencyName = name;
	}
	
	/**
	 * Sets the emergency contact number
	 * 
	 * @param phoneNum takes the emergency contact name
	 */
	public void setEmergencyPhoneNum(String phoneNum) {
		emergencyPhoneNum = phoneNum;
	}
	
	//methods
	/**
	 * Concatenates the first middle and last name
	 * 
	 * @return returns the concatenated string
	 */
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	/**
	 * Concatenates the street address, city, state and zip code
	 * 
	 * @return returns the concatenated string
	 */
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	
	/**
	 * Concatenates the emergency name and phone number
	 * 
	 * @return returns the concatenated string
	 */
	public String buildEmergencyContact() {
		return emergencyName + " " + emergencyPhoneNum;
	}
	
	/**
	 * Display all patient information
	 */
	public String toString() {
		return "\nPatient info: \n  Name: " + buildFullName() + 
				"\n  Address: " + buildAddress() +
				"\n  Emergency Contact: " + buildEmergencyContact();
	}
	
}
