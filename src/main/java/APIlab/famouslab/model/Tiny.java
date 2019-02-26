package APIlab.famouslab.model;

public class Tiny {
	private Integer year;
	private String name;
	private String invented;
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvented() {
		return invented;
	}
	public void setInvented(String invented) {
		this.invented = invented;
	}
	@Override
	public String toString() {
		return "TinyScientist [year=" + year + ", name=" + name + ", invented=" + invented + "]";
	}

}
