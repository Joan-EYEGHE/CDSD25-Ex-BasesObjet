package domaine;

public class Point {

    // Attributs
    private double x; // abcisse
    private double y; // ordonnée

    // Fonctions
        // Constructor
    public Point (double xi, double yi)
    {x=xi; y=yi;}


        // Getters
    public double consulterX(){return x;}
    public double consulterY(){return y;}

        // Setters
    public void modifierX(double nx){x=nx;}
    public void modifierY(double ny){y=ny;}

}
