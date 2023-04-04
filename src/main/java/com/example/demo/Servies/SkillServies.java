
package com.example.demo.Servies;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Design;
import com.example.demo.Entity.Skill;
import com.example.demo.Repository.Designrepository;
import com.example.demo.Repository.Skillrepository;

@Service
public class SkillServies {

	@Autowired
	private Skillrepository skillrepository;
	@Autowired
	private Designrepository designrepository;

	public Skill dd() {
		List<Skill> l1 = new ArrayList<Skill>();
		int dd = 1;
		skillrepository.findById(dd);
		return skillrepository.getById(dd);
	}

	public List<Design> ddd() {
		List<Design> l1 = new ArrayList<Design>();
		int dd = 11;
		l1 = designrepository.findAll();
		return l1;
	}
}
