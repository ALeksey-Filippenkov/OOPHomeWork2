public class TwoFace extends Person implements Detentions{
    public TwoFace(String name) {
        super(name);
    }

    public String PersonClass() {
        return "Злодей";
    }

    @Override
    public String say() {
        return "The city is not what it seems!";
    }

    @Override
    public int NumberOfDetentions() {
        return 15;
    }


}
