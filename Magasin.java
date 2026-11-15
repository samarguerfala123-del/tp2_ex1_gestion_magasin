package gestion_magasin;

public class Magasin {

	private int capacite;
	private  Article[]stock;
	private int nbarticle;
	
	public Magasin(int capacite) {
		this.capacite=capacite;
		stock=new Article[capacite];
		nbarticle=0;
		}
	
	public void ajout(Article a) {
		if(nbarticle<capacite) {
			stock[nbarticle]=a;
			nbarticle++;
			
			System.out.println("artcile ajoutee avec succe");
		}else {
			System.out.println("stock plein!");
		}
	}
	public void inventaire()
	{
		for(int i=0;i<nbarticle;i++) {
			System.out.println(stock[i].toString());
			System.out.println("inventaire !!");
			
		}
	}
}
