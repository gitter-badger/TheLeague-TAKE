package pl.polsl.take.projekt;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Result implements Serializable {

	private static final long serialVersionUID = 7308262835173968577L;

	int id;
	
	//'1' 'X' '2'
	char result;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getResult() {
		return result;
	}

	public void setResult(char result) {
		if(result == '1' || result == 'X' || result == '2')
		{
			this.result = result;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}
	
	
}
