package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/*
 * Mappiamo la classe MyController con l'annotazione Controller
 */
@Controller
public class MyController {
	
	/*
	 * L'applicazione alla chiamata get verso localhost:8080
	 * risponderà con il file index
	 */
	@GetMapping("/")
	public String getIndex(Model m1) {
		
		// creiamo una stringa
		String nome = "Carlo";
		
		
		/*
		 * La passiamo al model con la dicitura nome
		 * assegniamo alla variabile nome il suo valore
		 */
		m1.addAttribute("nome", nome);
		
		return "index";
	}
	/*
	 * L'applicazione alla chiamata get verso localhost:8080/contact
	 * risponderà con il file contact
	 */
	@GetMapping("/contact")
	public String getContact(Model m1) {
		
		String giorno = "Martedì";
		
		m1.addAttribute("giorno", giorno);
		return "contact";
	}
	/*
	 * L'applicazione alla chiamata get verso localhost:8080/blog
	 * risponderà con il file blog
	 */
	@GetMapping("/blog")
	public String getBlog(Model m1) {
		
		ArrayList <String> colori = new ArrayList <>();
		colori.add("Rosso");
		colori.add("Verde");
		colori.add("bianco");
		
		
		//passiamo la lista al file blog.html
		m1.addAttribute("lista", colori);
		
 		
		
		return "blog";
	}
	
	
	
	

}
