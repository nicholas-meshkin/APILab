package APIlab.famouslab.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ScientistResponse {

	@JsonProperty("complete")
	private List<Complete> completeList;
	
	@JsonProperty("tiny")
	private List<Tiny> tinyList;

	public List<Complete> getCompleteList() {
		return completeList;
	}

	public void setCompleteList(List<Complete> completeList) {
		this.completeList = completeList;
	}

	public List<Tiny> getTinyList() {
		return tinyList;
	}

	public void setTinyList(List<Tiny> tinyList) {
		this.tinyList = tinyList;
	}

	@Override
	public String toString() {
		return "ScientistResponse [completeList=" + completeList + ", tinyList=" + tinyList + "]";
	}
}
