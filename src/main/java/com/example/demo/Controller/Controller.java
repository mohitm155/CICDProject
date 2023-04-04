
package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Design;
import com.example.demo.Entity.Skill;
import com.example.demo.Repository.Designrepository;
import com.example.demo.Repository.Skillrepository;
import com.example.demo.Servies.SkillServies;

@RestController
public class Controller {

	@Autowired
	private Skillrepository skillrepository;
	@Autowired
	private Designrepository Designrepository;

	@Autowired
	private SkillServies skillServies;

	@GetMapping("/skill")
	public ResponseEntity<List<Skill>> ss() {

		// List<Design> l2 = skillServies.dd();
		int dd = 1;
		List<Skill> vv = skillrepository.findAll();

		return ResponseEntity.ok(vv);
	}

	@GetMapping("/skillm")
	public String ssd() {

		// List<Design> l2 = skillServies.dd();
		int dd = 1;
		List<Skill> vv = skillrepository.findAll();

		return "umesh";
	}

	/*
	 * @GetMapping("/all") public ResponseEntity<String> deta() { // List<Skill> l1
	 * = skillrepository.findAll();
	 * 
	 * return ResponseEntity.ok("umesh");
	 * 
	 * 
	 * @GetMapping("/employeeall") public List<Employee> deta1() { List<Employee> l2
	 * = employeeService.all(); return l2; }
	 * 
	 * @PostMapping("/employeeall") public ResponseEntity<Employee>
	 * deta1(@RequestBody Employee employee) {
	 * employeeService.saveEmployee(employee); return (ResponseEntity<Employee>)
	 * ResponseEntity.status(HttpStatus.OK); }
	 * 
	 * }
	 */
}
