
package com.example.demo.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity

@Table(name = "designas")
public class Design {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int designid;
	private String springboot, java;
	@OneToOne(targetEntity = Skill.class)
	@JsonBackReference
	private Skill skill;

	public int getDesignid() {
		return designid;
	}

	public void setDesignid(int designid) {
		this.designid = designid;
	}



	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	/**
	 * @param designid
	 * @param angular
	 * @param java
	 * @param skill
	 */
	

	/**
	 * 
	 */
	public Design() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param designid
	 * @param springboot
	 * @param java
	 * @param skill
	 */
	public Design(int designid, String springboot, String java, Skill skill) {
		super();
		this.designid = designid;
		this.springboot = springboot;
		this.java = java;
		this.skill = skill;
	}

	public String getSpringboot() {
		return springboot;
	}

	public void setSpringboot(String springboot) {
		this.springboot = springboot;
	}

}
