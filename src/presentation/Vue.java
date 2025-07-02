package presentation;
import domaine.*;
import metier.*;

public class Vue {
    public static void main(String [] args){

        // Création des points
        Point p1 =new Point(2,4);
        Point p2 =new Point(8,-3);
        Traitement tr = new Traitement();

        // Affichage des valeurs des points
        System.out.println("L'abcisse de P1 : " + p1.consulterX());
        System.out.println("L'ordonnée de P1 : " + p1.consulterY());
        System.out.println("L'abcisse de P2 : " + p2.consulterX());
        System.out.println("L'ordonnée de P2 : " + p2.consulterY());

        // La norme des points
        System.out.println("La norme de P1 : " + tr.norme(p1));
        System.out.println("La norme de P2 : " + tr.norme(p2));

        // Translation des points
        tr.translater(p1, 2, -1);
        tr.translater(p2, 3, 0);

        // Affichage des valeurs des points après translation
        System.out.println("Nouvelle abcisse de P1 : " + p1.consulterX());
        System.out.println("Nouvelle ordonnée de P1 : " + p1.consulterY());
        System.out.println("Nouvelle abcisse de P2 : " + p2.consulterX());
        System.out.println("Nouvelle ordonnée de P2 : " + p2.consulterY());

        System.out.println("Nouvelle norme de P1 : " + tr.norme(p1));
        System.out.println("Nouvelle norme de P2 : " + tr.norme(p2));
    }
}
