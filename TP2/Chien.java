public class Chien implements Animal {

    public String name;
    public String race;

    public Chien(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String toString() {
        return "Chien: {" + '\n' + '\t' + "nom: " + name + '\n' + '\t' + "race: " + race + '\n' + '}';
    }

    @Override
    public String emettreSon() {
        return "Waf";
    }

    @Override
    public void afficherInfos() {
        System.out.println(this);;
    }
}
