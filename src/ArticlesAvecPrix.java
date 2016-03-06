public class ArticlesAvecPrix {
	ArticlesEnStock stock;
	int prixUnitaire;
	int prixTotal;
	
	ArticlesAvecPrix(String nom, String code){
		this.stock = new ArticlesEnStock(nom, code);
	}
	public void setPrixUnitaire(int prix){
		this.prixUnitaire = prix;
	}
 	public void ajouter(int nombre){
 		prixTotal += prixUnitaire * nombre;
 		stock.ajouter(nombre);
 	}
 	public String getCode(){
 		return stock.getCode();
 	}
 	public String getNom(){
 		return stock.getNom();
 	}
 	public int getQuantite(){
 		return stock.getQuantite();
 	}
 	public void retirer(int nombre){
 		prixTotal -= nombre * prixTotal/stock.getQuantite();
 		stock.retirer(nombre);
 	}
	public String toString(){
 		return stock.toString()+"prix unitaire : "+prixUnitaire+", prix Total : "+prixTotal;
 	}
}
