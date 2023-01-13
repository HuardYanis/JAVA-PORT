
public class Montgolfiere implements IAmarable {
    //Datas
    int surface ;
    // Constructeur
    public Montgolfiere() {
        System.out.println("creation de montgolfiere");
    }

    // méthodes
    // méthode surchargée ( déclarée dans interface Amarable )


    public int nbrCordes() {
        return surface/50 ;
    }
}
