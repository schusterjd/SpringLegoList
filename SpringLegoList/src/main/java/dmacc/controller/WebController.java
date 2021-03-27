/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Mar 24, 2021
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.LegoSets;
import dmacc.repository.LegoRepository;

@Controller
public class WebController {

	@Autowired
	LegoRepository repo;

	@GetMapping({"/", "viewAll"})
	public String viewAllSets(Model model) {
		
		if(repo.findAll().isEmpty()) {
			return addNewSet(model);
		}
		
		model.addAttribute("sets", repo.findAll());
		return "results";
		
	}
	
	@GetMapping("/inputSet")
	public String addNewSet(Model model) {
		
		LegoSets s = new LegoSets();
		model.addAttribute("newSet", s);
		return "input";
		
	}
	
	@PostMapping("/inputSet")
	public String addNewSet(@ModelAttribute LegoSets s, Model model) {
		
		repo.save(s);
		return viewAllSets(model);
		
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateSet(@PathVariable("id") long id, Model model) {
		LegoSets s = repo.findById(id).orElse(null);
		model.addAttribute("newSet", s);
		return "input";
		
	}
	
	@PostMapping("/update/{id}")
	public String reviseSet(LegoSets s, Model model) {
		
		repo.save(s);
		return viewAllSets(model);
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		
		LegoSets s = repo.findById(id).orElse(null);
		repo.delete(s);
		return viewAllSets(model);
		
	}

}
