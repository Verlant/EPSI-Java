import java.util.Objects;

public class Personne {
    public String nom;
    public int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public Personne(){}
    public String afficherDetails() {
        return "Nom = " + this.nom + ", Age = " + this.age;
    }

    public boolean egal(Personne p) {
        return p == this;
//        return this.nom == p.nom && this.age == p.age;
    }
    @Override
    public String toString() {
        return super.toString() + " :\nNom = " + this.nom + "\nAge = " + this.age;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if ((o == null) || this.getClass() != o.getClass()) return false;
        Personne p = (Personne) o;
        return Objects.equals(this.nom, p.nom) && Objects.equals(this.age, p.age);
    }
}