//import java.util.*;
public class Main {
		
		public static void main(String[] args){
			/*Scanner clavier = new Scanner(System.in);
			double lu=clavier.nextDouble();*/
			
			Point A =new Point();
			Point B =new Point(5);
			Point C =new Point(3,8);
			
			System.out.println("* Cr�er 3 Points dans l'espace on utilisant 3 consctructeur diff�rents ");
			System.out.println("-Le Point A mes coordonn�es sont : A"+A.toString());
			System.out.println("-Le Point B mes coordonn�es sont : B"+B.toString());
			System.out.println("-Le Point C mes coordonn�es sont : C"+C.toString());
			
			
			System.out.println("* Donner les images de A , B et C ");
			System.out.println("-L'image de A est : A-1"+A.imagePoint());
			System.out.println("-L'image de B est : B-1"+B.imagePoint());
			System.out.println("-L'image de C est : C-1"+C.imagePoint());
		}
}
