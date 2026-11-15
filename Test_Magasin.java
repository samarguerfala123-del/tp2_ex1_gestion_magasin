package gestion_magasin;
import java.util.Scanner;
public class Test_Magasin {

	public static void main(String[] args) {
		
Scanner Sc= new Scanner(System.in);

System.out.println("donner la capacite du magasin:");
int cap=Sc.nextInt();
Sc.nextLine();

Magasin magasin=new Magasin(cap);

for(int i=0;i<cap;i++) {
	System.out.println("Article"+(i+1));
	
		System.out.println("donner le numero  inventaire:");
		int num=Sc.nextInt();
		Sc.nextLine();
		
		System.out.println("donner la designation:");
		String des=Sc.nextLine();
		
		System.out.println("donner la couleur:");
		String coul=Sc.nextLine();
		
		System.out.println("donner la prix:");
		double prix=Sc.nextDouble();
		Sc.nextLine();
		
		System.out.println("donner la famille:");
		String fam=Sc.nextLine();
		
		 Article a=new Article(num,des,coul,prix,fam);
		 
		 magasin.ajout(a);
}
System.out.println(" INVENTAIRE DU MAGASIN  :");
magasin.inventaire();
Sc.close();

	}

}
