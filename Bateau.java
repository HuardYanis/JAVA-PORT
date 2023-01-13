
public class Bateau implements IAmarable {
    // datas
    public int masse ;

    // méthodes
    // Constructeur
    public Bateau(){
        System.out.println("creation d'un bateau");
    }

    // methode surchargée (override) (déclarée dans interface IAmarable )
    @Override
    public int nbrCordes() {
        // nbre cordes necessaires à l'amarrage
        // depend des propriétées de l'objet
        // par exemple ici il faut 1 corde pour 10T
        return masse / 10 ;
    }
}
