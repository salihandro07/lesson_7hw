public class Magic extends Hero {

    public Magic(int health, int damage){
        super(health, damage, "FIREBALL");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность FIREBALL");
    }
}