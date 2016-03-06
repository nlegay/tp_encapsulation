import java.util.Random;

public class Roulette {
	Random r = new Random();
	String lancer(){
		int nbre = r.nextInt(36)+1;
		String couleur = "Rouge";
		String type = "Impair";
		String autre = "Passe";
		if(nbre == 2 || nbre==4 || nbre==6 || nbre==8 || nbre==10 || nbre==11 || nbre==13 || nbre==15 || nbre== 17 || nbre==20 || nbre==22 || nbre==24 || nbre==26 || nbre==28 || nbre==29 || nbre==31 || nbre==33 || nbre==35){
			couleur = "Noir";
		}
		if(nbre%2 == 0){
			type = "Pair";
		}
		if(nbre >=1 && nbre <=18){
			autre = "Manque";
		}
		return "Rien ne va plus : "+nbre+" - "+couleur+" - "+type+" et "+autre;
	}
}