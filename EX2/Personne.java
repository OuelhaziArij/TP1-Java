class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String sexe;

    public Personne() {
        this.nom = "Ben Ali";
        this.prenom = "Ali";
        this.age = 30;
        this.sexe = "Homme";
    }

    public Personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String getName() {
        return this.nom;
    }

    public String getprenom() {
        return this.prenom;
    }

    public int getAge() {
        return this.age;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void afficher() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Age: " + this.age);
        System.out.println("Sexe: " + this.sexe);
    }

    public boolean sameLastName(Personne p) {
        return ((p.nom.compareTo(this.nom) == 0));
    }

    public static void main(String[] args) {
        Personne p = new Personne();
        Personne p2 = new Personne("Ouelhazi", "Arij", 19, "Femme");
        p.afficher();
        p2.afficher();
        if (p.sameLastName(p2) == true) {
            System.out.println("elles ont le même nom  ");
        } else {
            System.out.println("n'est pas  le même nom  ");
        }
        if (p.getAge() > p2.getAge()) {
            System.out.println(p.prenom + " est le plus âgé.");

        } else {
            System.out.println(p.prenom + " est le plus âgé.");
        }

    }
}
