
public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double procedureCharges;
	
	/**
	 * Procedure constructor
	 */
	Procedure(){}
	
	/**
	 * This constructor assigns procedureName and procedureDate
	 * to the given values 
	 *  
	 * @param procedureName takes the procedure name
	 * @param date takes the procedure date
	 */
	Procedure(String procedureName, String date){
		this.procedureName = procedureName;
		procedureDate = date;
	}
	
	/**
	 * This constructor assigns procedureName, procedureDate
	 * practitionerName and procedureCharges to the given
	 * values
	 * 
	 * @param procedureName takes the procedure name
	 * @param date takes the procedure date
	 * @param practitionerName takes the practitioner name
	 * @param charges takes the procedure charges
	 */
	Procedure(String procedureName, String date, String practitionerName, double charges){
		this.procedureName = procedureName;
		procedureDate = date;
		this.practitionerName = practitionerName;
		procedureCharges = charges;
	}
	
	//Mutator methods
	/**
	 * Sets the procedure name
	 * 
	 * @param name takes procedure name
	 */
	public void setProcedureName(String name) {
		procedureName = name;
	}
	
	/**
	 * Sets the procedure date
	 * 
	 * @param date takes the procedure date
	 */
	public void setProcedureDate(String date) {
		procedureDate = date;
	}
	
	/**
	 * Sets the practitioner name
	 * 
	 * @param name takes the practitioner name
	 */
	public void setPractitionerName(String name) {
		practitionerName = name;
	}
	
	/**
	 * Sets the procedure charge
	 * 
	 * @param charges takes the procedure charge
	 */
	public void setProcedureCharges(double charges) {
		procedureCharges = charges;
	}
	
	//Accessor methods
	public String getProcedureName() {
		return procedureName;
	}
	
	public String getProcedureDate() {
		return procedureDate;
	}
	
	public String getPractitionerName() {
		return practitionerName;
	}
	
	public double getProcedureCharges() {
		return procedureCharges;
	}
	
	/**
	 * Displays all procedure information 
	 */
	public String toString() {
		return "\n\tProcedure: " + procedureName + 
				"\n\tProcedureDate=" + procedureDate + 
				"\n\tPractitioner=" + practitionerName +
				"\n\tCharge=" + procedureCharges;
	}
}

