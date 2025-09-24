class Etudiant {
    public String nom;
    public String prenom;
    private int Age;

    public Etudiant(String nom, String prenom, int Age) {
        this.nom = nom;
        this.prenom = prenom;
        this.Age = Age;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getAge() {
        return this.Age;
    }

    public void SeterNom(String nom) {
        this.nom = nom;
    }

    public void SeterPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void SeterAge(int Age) {
        this.Age = Age;
    }

    public static void main(String[] args) {
        Etudiant etud = new Etudiant("Ouelhazi", "Arij", 19);
        String nom = etud.getNom();
        String prenom = etud.getPrenom();
        int Age = etud.getAge();
        System.out.println("Le nom est " + nom);
        System.out.println("Le prenom est " + prenom);
        System.out.println("L'age est " + Age);
        etud.SeterNom("Hammami");
        etud.SeterPrenom("Fatma");
        etud.SeterAge(20);
        nom = etud.getNom();
       prenom = etud.getPrenom();
         Age = etud.getAge();
        System.out.println("Le nom est " + nom);
        System.out.println("Le prenom est " + prenom);
        System.out.println("L'age est " + Age);
    }

}
