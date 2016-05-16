package pl.polsl.take.projekt;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Goal implements Serializable {

	private static final long serialVersionUID = 5933650953441910473L;
	
	int id;
	Footballer footballer;
	Match match;
	int time;
	boolean ownGoal;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Footballer getFootballer() {
		return footballer;
	}
	public void setFootballer(Footballer footballer) {
		this.footballer = footballer;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public boolean isOwnGoal() {
		return ownGoal;
	}
	public void setOwnGoal(boolean ownGoal) {
		this.ownGoal = ownGoal;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
