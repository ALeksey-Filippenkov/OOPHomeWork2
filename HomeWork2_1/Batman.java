public class Batman extends Heroes {
    public Batman(String name) {
        super(name);
    }

    public String PersonClass() {
        return "Герой";
    }

    @Override
    public String say() {
        return "Today the city can sleep peacefully!";
    }
}
