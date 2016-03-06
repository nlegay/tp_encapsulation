public class SuperStock {
	private Stock stock;
	
	public SuperStock(int maxArticles){
		this.stock = new Stock(maxArticles); 
	}
 	public void ajoutArticle(ArticlesEnStock a){
 		stock.ajoutArticle(a);
 	}
 	public ArticlesEnStock getArticleByPosition(int num){
 		return stock.getArticleByPosition(num);
 	}
 	public int nbReferences(){
 		return stock.nbReferences();
 	}
 	public String toString(){
 		return stock.toString();
 	}
 	ArticlesEnStock getByNom(String nom){
 		int nbRef = this.stock.nbReferences();
 		for(int i=0; i<nbRef; i++){
 			if(stock.getArticleByPosition(i).getNom() == nom){
 				return stock.getArticleByPosition(i);
 			}
 		}	
 		return null;
 	}
 	ArticlesEnStock getByCode(String code){
 		return stock.getArticleByPosition(Integer.getInteger(code));
 	}
}
