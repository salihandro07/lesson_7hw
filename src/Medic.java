public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints){
        super(health, damage, "2X HEALING");
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность 2X HEALING");
    }

    public void increaseExperience() {
        this.healPoints = (int) (healPoints * 1.1);
    }
}
