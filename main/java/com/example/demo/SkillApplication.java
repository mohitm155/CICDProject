package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SkillApplication {
	/*
	 * @Autowired private Skillrepository skillreository;
	 * 
	 * @Autowired private Designrepository designrepository;
	 */

	public static void main(String[] args) {
		SpringApplication.run(SkillApplication.class, args);
		System.out.println("start");
	}

	// @Override
	// public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	/*
	 * Level level = new Level(); Level level1 = new Level(); Skill skill = new
	 * Skill(); Design design = new Design(); design.setSkillname("Angular");
	 * design.setSkillname("Java"); List<Level> l1 = new ArrayList<Level>();
	 * List<Level> l2 = new ArrayList<Level>(); List<Design> D1 = new
	 * ArrayList<Design>(); D1.add(design); l1.add(level);
	 * level.setLevelnumber("1"); level1.setLevelnumber("2"); design.setLevel(l1);
	 * skill.setDesign(D1);
	 * 
	 * System.out.println(design.getSkillname());
	 */

}
