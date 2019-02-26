package APIlab.famouslab.model;

public class Complete {

	private Integer year;
	private String firstName;
	private String lastName;
	private String innovation;
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInnovation() {
		return innovation;
	}
	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}
	@Override
	public String toString() {
		return "CompleteScientist [year=" + year + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", innovation=" + innovation + "]";
	}
	
}
