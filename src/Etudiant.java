import java.util.ArrayList;

public class Etudiant {

    // attributs : PRIVÉS
    private String nom;
    private int anneeNaissance;
    private ArrayList<Float> notes;
    private int id;
    private float taille;

    // méthodes

    // constructeurs
    // constructeur par défaut
    public Etudiant() {
        System.out.println("Constructeur par défaut");
        this.nom = "John";
        this.anneeNaissance = 2007;
        this.notes = new ArrayList<>();
        this.id = 9;
        this.taille = 12.f;
    }

    // constructeur paramétré
    public Etudiant(String n, int a, int id, float taille) {
        System.out.println("Constructeur paramétré 1");
        this.nom = n;
        this.anneeNaissance = a;
        this.notes = new ArrayList<>();
        this.id = id;
        this.taille = taille;
    }

    public Etudiant(int a, int id, float taille) {
        System.out.println("Constructeur paramétré 2");
        this.nom = "Bob";
        this.anneeNaissance = a;
        this.notes = new ArrayList<>();
        this.id = id;
        this.taille = taille;
    }

    // accesseurs = GETTER + SETTER (pour chaque attribut)
    public String getNom() {
        return this.nom;
    }

    public void setNom(String n) {
        if (n != "f*ck")
            this.nom = n;
    }

    public int getAnneeNaissance() {
        return this.anneeNaissance;
    }

    public void setAnneeNaissance(int a) {
        this.anneeNaissance = a;
    }

    public ArrayList<Float> getNotes() {
        return this.notes;
    }

    public void setNotes(ArrayList<Float> n) {
        this.notes = n;
    }


    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }


    public float getTaille() {
        return this.taille;
    }

    public void setTaille(float t) {
        this.taille = t;
    }

    @Override
    public String toString() {
        return "Etudiant s'appelant " + this.nom +
                " et qui est né en " + this.anneeNaissance +
                "qui a une id " + this.id +
                "qui est de taille" + this.taille;

    }

    public int age() {
        return 2026 - this.anneeNaissance;
    }


    // 11/03 DERNIER COURS

    public void ajoutNote(float n) {
        this.notes.add(n);

    }


    public Float avoirNote(int i) {
        return this.notes.get(i);

    }

    public void modifierNote(int i, float n) {
        this.notes.set(i, n);
    }






    public float moyenne() {
        float somme = 0;
        // PARCOURIR CHAQUE CASE DU TABLEAU
        for (int i = 0; i < this.notes.size(); i++) {
            // Additonner les valeurs pour obtenir la somme totale
            somme += this.notes.get(i);
        }
        // Diviser par le nbre de notes
        // Renvoyer la moyenne
        return somme / this.notes.size();
    }







    public void VoirNote() {
        for (int i = 0; i < this.notes.size(); i++) {
            System.out.println(this.notes.get(i));

        }


    }

}





