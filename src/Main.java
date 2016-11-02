//import java.util.*;
public class Main {
		
		public static void main(String[] args){
			/*Scanner clavier = new Scanner(System.in);
			double lu=clavier.nextDouble();*/
			
			Point A =new Point();
			Point B =new Point(5);
			Point C =new Point(3,8);
			
			System.out.println("* Créer 3 Points dans l'espace on utilisant 3 consctructeur différents ");
			System.out.println("-Le Point A mes coordonnées sont : A"+A.toString());
			System.out.println("-Le Point B mes coordonnées sont : B"+B.toString());
			System.out.println("-Le Point C mes coordonnées sont : C"+C.toString());
			
			
			System.out.println("* Donner les images de A , B et C ");
			System.out.println("-L'image de A est : A-1"+A.imagePoint());
			System.out.println("-L'image de B est : B-1"+B.imagePoint());
			System.out.println("-L'image de C est : C-1"+C.imagePoint());
		}
}
