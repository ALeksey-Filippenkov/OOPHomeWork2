import java.util.ArrayList;
import java.util.List;

public class Gotham {
    private List<Person> listVillains = new ArrayList<>();
    private List<Person> listHeroes = new ArrayList<>();

    public Gotham SetListVillains(Person villains) {
        listVillains.add(villains);
        return this;
    }

    public List<Person> GetListVillains() {
        return listVillains;
    }

    public Gotham SetListHeroes(Person heroes) {
        listHeroes.add(heroes);
        return this;
    }

    public List<Person> GetListHeroes() {
        return listHeroes;
    }

    public List<Says> GetSays() {
        List<Says> says = new ArrayList<>();
        for (var item : listVillains) {
            says.add(item);
        }
        return says;
    }

    public List<Detentions> Detentions() {
        List<Detentions> detentions = new ArrayList<>();
        for (var item : listVillains) {
            if (item instanceof Detentions)
                detentions.add((Detentions) item);
        }
        return detentions;
    }

    public Detentions WinnerOfDetentions() {
        int index = 0;
        for (int i = 0; i < Detentions().size(); i++) {
            if (Detentions().get(i).NumberOfDetentions() > Detentions().get(index).NumberOfDetentions())
                index = i;
        }
        return Detentions().get(index);
    }
}
