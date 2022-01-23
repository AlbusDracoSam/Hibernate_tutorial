package com.telusko.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alien_table")
public class Alien {
	
	@Id
	private int aid;
	private AlienName aname;
	private String color;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String acolor) {
		this.color = acolor;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
	

}
