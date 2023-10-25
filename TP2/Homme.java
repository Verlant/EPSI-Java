public class Homme extends Personne{
    public String sexe;

    public Homme(String nom, int age, String sexe) {
        super(nom, age);
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "Homme{" +
                "sexe='" + sexe + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
