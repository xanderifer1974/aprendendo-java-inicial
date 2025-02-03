package br.com.postmanager;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.postmanager.entities.Comment;
import br.com.postmanager.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//Formata uma data a partir de um texto.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow, that´s awesome!");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this worderful country",5);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		

	}

}
