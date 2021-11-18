package fr.eni.demoModelAttribute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.demoModelAttribute.model.Compteur;


@Controller
@RequestMapping({"/", "/demoModelAttribute"})
@SessionAttributes("compteur")
public class DemoModelAttributeController {
	
	//initialisation du compteur
	@ModelAttribute("compteur") 
	public Compteur getCompteur() {
		System.out.println("Dans getCompteur()");
		return new Compteur(); 
	}
	
	@ModelAttribute("monMessage")
	public String monMsg() {
		System.out.println("dans monMsg");
		return "bla bla bla";
	}
	
	@GetMapping()
//	public String accueil(@ModelAttribute Compteur compteur) {
	public String accueil(
			@ModelAttribute(name = "monMessage") String monMessage,
			@ModelAttribute Compteur compteur
			) {
		System.out.println("Dans accueil()-monMessage=" + monMessage);
		compteur.incrementerNbGets();

		return "index";
	}
	
	@PostMapping()
	public String traiteIndex(@ModelAttribute Compteur compteur) {
		System.out.println("Dans traiteIndex");		
		compteur.incrementerNbPosts();
		
		return "index";
	}	
	
}
