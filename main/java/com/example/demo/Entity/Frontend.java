package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity

@Table(name = "front")
public class Frontend {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int frontid;
	private String react, js;
	@OneToOne(targetEntity = Skill.class)
	@JsonBackReference
	private Skill skill;
	public int getFrontid() {
		return frontid;
	}
	public void setFrontid(int frontid) {
		this.frontid = frontid;
	}
	public String getReact() {
		return react;
	}
	public void setReact(String react) {
		this.react = react;
	}
	public String getJs() {
		return js;
	}
	public void setJs(String js) {
		this.js = js;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	/**
	 * @param frontid
	 * @param react
	 * @param js
	 * @param skill
	 */
	public Frontend(int frontid, String react, String js, Skill skill) {
		super();
		this.frontid = frontid;
		this.react = react;
		this.js = js;
		this.skill = skill;
	}
	/**
	 * 
	 */
	public Frontend() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
