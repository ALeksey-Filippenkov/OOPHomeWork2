public abstract class Person implements Says{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String PersonClass();

    @Override
    public String toString() {
        return String.format("Имя: %s, Говорит: %s - %s",  name, say(), PersonClass());
    }
}
