package gestion_magasin;

public class Article_Lot extends Article{
	private int nbpieces;
public Article_Lot(int numinventaire, String desingnation,
		String couleur, double prix, String famille,int nbpieces) {
	
		super(numinventaire, desingnation, couleur, prix, famille);
		this.nbpieces=nbpieces;
	}


 public String toString() {
	 
	 return super.toString()+"/nbpieces:"+nbpieces;

	
}
	

	
	



}
