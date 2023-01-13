
public class Port {
    // Datas

    // Methodes
    public Port() {
        System.out.println("Constructeur du Port");
    }

    public void accueilEngin(IAmarable amarable) {
        int cordes = amarable.nbrCordes();
        System.out.println("Nombre de cordes nécessaires:" + cordes);
    }
}
