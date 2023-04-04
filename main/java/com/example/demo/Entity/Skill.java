package com.example.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "skills")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int skillid;
	@OneToOne(cascade = CascadeType.ALL, targetEntity = Design.class)
	@JsonManagedReference
	private Design design;
	@OneToOne(cascade = CascadeType.ALL, targetEntity = Frontend.class)
	@JsonManagedReference
	private Frontend front;

	public int getSkillid() {
		return skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}

	public Frontend getFront() {
		return front;
	}

	public void setFront(Frontend front) {
		this.front = front;
	}

}
