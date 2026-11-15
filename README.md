Tp2 Ex1 gestion d'un magasin:

* Nom Et Prénom :
Samar Geurfala

* Les classes:
- Article.
- Article_Lot.
- Magasin.
- Test_Magasin.

 * Les diagrammes de classes UML :

 - Article{

# numinventaire:int
# designation:string
 # couleur:string
# prix:double
 # famille:string
  
  + tostring()
  + memefamille()}


 - Article_Lot{
  # nbpieces:int
  + tostring()}


  - Magasin:{
  # capacite:int   
  # stock:Article[]
  # nbarticle:int
  + ajout()
  + inventaire()}

   -Test_Magasin:{
 # main
}
 

