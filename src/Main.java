



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // variable pour stocker un Etudiant
        // Déclaration
        Etudiant etu;
        // Initialisation / construction
        etu = new Etudiant();

        /*

        Etudiant etu3 = new Etudiant("Yekzan", 2002, 4, 2);


        etu3.setNom("f*ck");

        etu3.setNom("f*ck");
        System.out.println(etu3.getNom());
*/

        etu.ajoutNote(13.0f);
        etu.ajoutNote(19.0f);
        etu.ajoutNote(1.0f);
        etu.ajoutNote(13.0f);
        System.out.println(etu.getNotes());

    }
}


