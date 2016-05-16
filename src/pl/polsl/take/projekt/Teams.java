package pl.polsl.take.projekt;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Teams {
	private List<Team> teams = new ArrayList<Team>();

	public Teams(List<Team> teams) {
		super();
		this.teams = teams;
	}

	public Teams() {	}
	
	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
	
	
}
