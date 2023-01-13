public interface IAmarable {

    //
    // Représente une capacité donnée à une  classe (able)
    //
    // ici c'est nombre de cordes nécessaires à l'amarrage
    // pour un bateau ou une montgolfière ou tout autre classe qui implementera cette interface
    // les classes qui implémentent cette interface devront définir cette méthode
    // c'est un contrat. La même fonctionnalité en langage ObjectiveC (C Objet de Apple IOS)
    // s'appelle protocole
    // on a créé un Port sur lequel un bateau et une montgolfiere peuvent s'amarrer.
    // de cette manière je pourrais y rajouter un hydravion.
    // peut importe la nature de l'objet pour le port ce qui l'intéresse c'est que l'objet soit amarrable

    // SI LA NOTION D'INTERFACE N'EXISTAIT PAS IL AURAIT FALLU CREER
    // UNE METHODE ACCUEIL BATEAU pour bateau ET UNE METHODE ACCUEIL MONTGOLFIERE pour la montgolfiere (et l'hydravion, et d'autres...)
    // Une classe peut hérité d'une classe puis d'une autre. L'interface peut aussi heriter d'un parent
    // Amarable pourrait hériter d'une autre interface.
    //

    //----------------- déclaration de fonction, il n'y a QUE la signature de la fonction. ---------------------------
    // nbrcordes
    // fonction qui devra donner le nombre de cordes nécessaires en fonction de l'objet
    // devra ête définie dans toute classe l'implémentant.
    //

    public int nbrCordes();

}
