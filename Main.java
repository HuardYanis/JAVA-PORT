 public class Main {

    public static void main( String[] args) {
        Bateau b1 = new Bateau();
        b1.masse = 60;

        Port iciCBrest = new Port();
        iciCBrest.accueilEngin(b1);

        Montgolfiere mg = new Montgolfiere();
        mg.surface=100 ;
        // admettons que la montgolfiere puisse s'amarrer au parc à chaines au port de Brest.
        iciCBrest.accueilEngin(mg);
    }
    test
}
