public class Robin extends Person{
    public Robin(String name) {
        super(name);
    }

    public String PersonClass() {
        return "Герой";
    }

    @Override
    public String say() {
        return "I'm running to help";
    }
}

