public class Chat implements Animal {
    public String name;
    public String race;
    public Chat(String name, String race) {
        this.name = name;
        this.race = race;
    }
    public String toString() {
        return "Chat: {" + '\n' + '\t' + "nom: " + name + '\n' + '\t' + "race: " + race + '\n' + '}';
    }
    @Override
    public String emettreSon() {
        return "Miaou";
    }

    @Override
    public void afficherInfos() {
        System.out.println(this);;
    }
}
