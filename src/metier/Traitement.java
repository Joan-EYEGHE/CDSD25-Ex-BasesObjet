package metier;
import domaine.*;

public class Traitement {

    // Fonctions
    // Norme
    public double norme (Point p){
        double x = p.consulterX();
        double y = p.consulterY();
        return Math.sqrt(x*x+y*y);
    }
    // Translater
    public void translater(Point p, double nx, double ny)
    {
        double x = p.consulterX();
        double y = p.consulterY();
        p.modifierX(x+nx);
        p.modifierY(y+ny);
    }

}
