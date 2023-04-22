public class Joker extends Person implements Detentions {
    public Joker(String name) {
        super(name);
    }

    public String PersonClass() {
        return "Злодей";
    }

    @Override
    public String say() {
        return "Ha-ha-ha-ha-ha!";
    }

    @Override
    public int NumberOfDetentions() {
        return 20;
    }
}
