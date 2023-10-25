import java.util.Objects;

public class Rectangle extends FormeGeometrique{
    public double longueur;
    public double largeur;
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculAire() {
        return this.longueur * this.largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * this.longueur + 2 * this.largeur;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Rectangle de longueur " + this.longueur + " et de largeur " + this.largeur);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return Double.compare(longueur, rectangle.longueur) == 0 && Double.compare(largeur, rectangle.largeur) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longueur, largeur);
    }
}
