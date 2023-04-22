public class HomeWork2_1 {
    public static void main(String[] args) {

        Gotham villains = new Gotham();
        villains.SetListVillains(new Penguin("Penguin"))
                .SetListVillains(new Joker("Joker"))
                .SetListVillains(new TwoFace("Two_Face"))
                .SetListVillains(new Scarecrow("Scarecrow"));
        for (var item : villains.GetListVillains()) {
            System.out.println(item);
        }
        Gotham heroes = new Gotham();
        heroes.SetListHeroes(new Batman("Batman"))
                .SetListHeroes(new Robin("Robin"));
        for (var item : heroes.GetListHeroes()) {
            System.out.println(item);
        }

        for (var item : villains.GetSays()) {
            System.out.println(item.say());
        }


        System.out.println("------------------");
        for (var item : villains.Detentions()) {
            System.out.printf("%s - %d\n", item.toString(), item.NumberOfDetentions());
        }
        System.out.println("-----------------");
        System.out.println("Winner " + villains.WinnerOfDetentions());
        System.out.println("-----------------");

    }
}
