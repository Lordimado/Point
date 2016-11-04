//import java.util.*;
public class Main {
		
		public static void main(String[] args){
			/*Scanner clavier = new Scanner(System.in);
			double lu=clavier.nextDouble();*/
			
			Point A =new Point();
			Point B =new Point();
			Point C =new Point();
			A.mesCoord();
			B.mesCoord();
			C.mesCoord();
			System.out.println("* Créer 3 Points dans l'espace on utilisant 3 consctructeur différents ");
			System.out.println("-Le Point A mes coordonnées sont : A"+A);
			System.out.println("-Le Point B mes coordonnées sont : B"+B);
			System.out.println("-Le Point C mes coordonnées sont : C"+C);
			
			
			System.out.println("* Donner les images de A , B et C ");
			System.out.println("-L'image de A est : A-1"+A);
			System.out.println("-L'image de B est : B-1"+B);
			System.out.println("-L'image de C est : C-1"+C);
		}
}
