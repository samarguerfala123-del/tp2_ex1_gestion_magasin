package gestion_magasin;

public class Article {
 private int numinventaire;
 private String desingnation;
 private String couleur;
 private double prix;
 private String famille;
 
public Article(int numinventaire, String desingnation,String couleur,
  double prix,String famille) {
	this.numinventaire=numinventaire;
	this.desingnation=desingnation;
	this.couleur=couleur;
	this.prix=prix;
	this.famille=famille;
}
public String toString() {
	return ("numinventaire :"+numinventaire+
			"/desingnation:"+desingnation+
			"/couleur:"+couleur+
			"/prix:"+prix+
			"/famille:"+famille);
}
public boolean memefamille (Article a) {
	
	if(this.famille.equals(a.famille)) {
		return true;
		
		}else {
			return false;
	}
}



}
