package com.khetra.lms;

//import javax.xml.bind.annotation.XmlRootElement;
import javax.json.bind.annotation.*;
//@XmlRootElement
@JsonbAnnotation
public class Alien {
	
	private String name;
	private int points;
	private int id;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPoints() {
		return points;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public String toString() {
		return "Alien [name=" + name + ", points=" + points + ", id=" + id + "]";
	}
	

	
}
