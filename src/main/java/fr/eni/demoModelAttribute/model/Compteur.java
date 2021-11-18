package fr.eni.demoModelAttribute.model;

public class Compteur {
	private Integer nbPosts;
	private Integer nbGets;
	
	public Compteur() {
		nbPosts = 0;
		nbGets = 0;
	}
	
	public void incrementerNbPosts() {
		nbPosts++;
	}

	public void incrementerNbGets() {
		nbGets++;
	}

	public Integer getNbPosts() {
		return nbPosts;
	}

	public void setNbPosts(Integer nbPosts) {
		this.nbPosts = nbPosts;
	}

	public Integer getNbGets() {
		return nbGets;
	}

	public void setNbGets(Integer nbGets) {
		this.nbGets = nbGets;
	}

	
	
	
	
}
