public class SpellCaster extends Hero {
    protected int mana ;
    public SpellCaster(int weaponDamage, int lifePoints, int armor, int potion, int mana) {
        this.weaponDamage = weaponDamage;
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.potion = potion;
        this.mana = mana ;
        
    }
    
    public void setmana() {
        this.mana = mana ;
    }
    public int getmana() {
        return mana ;
    }
}
