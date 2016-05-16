package pl.polsl.take.projekt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Footballer implements Serializable {

	private static final long serialVersionUID = -8182960434851092999L;
	
	int id;
	int name;
	int surname;
	byte numer;
	Date birthDay;
	Team team;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getSurname() {
		return surname;
	}
	public void setSurname(int surname) {
		this.surname = surname;
	}
	public byte getNumer() {
		return numer;
	}
	public void setNumer(byte numer) {
		this.numer = numer;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
