import java.util.Objects;

public class Cercle extends FormeGeometrique{
    public double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculAire() {
        return 2 * Math.PI * Math.sqrt(this.rayon);
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * (this.rayon);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Cercle de rayon " + this.rayon);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Cercle cercle = (Cercle) object;
        return Double.compare(rayon, cercle.rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon);
    }
}
