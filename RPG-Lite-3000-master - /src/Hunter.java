public class Hunter extends Hero {
    public int arrow;

    public Hunter(int weaponDamage, int lifePoints, int armor, int potion, int arrow) {
        this.weaponDamage = weaponDamage;
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.potion = potion;
        this.arrow = arrow;
    }
    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }
   
   
}
