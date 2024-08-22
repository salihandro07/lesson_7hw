public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[]{
                new Magic(100, 50),
                new Medic(120, 30, 30),
                new Warrior(150, 70)
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Medic увеличил свои очки лечения. Текущие очки лечения: "
                        + medic.superAbility);
            }
        }
    }
}