public class Scarecrow extends Person implements Detentions{
    public Scarecrow(String name) {
        super(name);
    }  

    public String PersonClass() {
        return "Злодей";
    }

    @Override
    public String say() {
        return "Fear is not so terrible. It just needs to be understood!";
    }

    @Override
    public int NumberOfDetentions() {
        return 5;
    }
}
