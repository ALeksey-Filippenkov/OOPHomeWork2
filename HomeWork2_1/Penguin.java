public class Penguin extends Person implements Detentions {

    public Penguin(String name) {
        super(name);
    }  

    public String PersonClass() {
        return "Злодей";
    }

    @Override
    public String say() {
        return "Gotham is mine!";
    }

    @Override
    public int NumberOfDetentions() {
        return 10;
    }
}
