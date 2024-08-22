public abstract class Hero implements HavingSuperAbility{
    public int health;
    public int damage;
    public String superAbility;

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }
}