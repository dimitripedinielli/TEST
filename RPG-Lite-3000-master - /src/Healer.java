public class Healer extends SpellCaster {

    public Healer(int weaponDamage, int lifePoints, int armor, int potion, int mana) {
        super(weaponDamage, lifePoints, armor, potion, mana);
        //TODO Auto-generated constructor stub
    }
    public static void attack(Enemy enemy, Hero hero) {
        if (hero.getClass().getName().equals("Healer")) {
            System.out.println(" ");
            System.out.println("Enemy : " + enemy.getLifePoints() + " HP");
            System.out.println("Hero Dammage : " + hero.getWeaponDamage());
            enemy.setLifePoints(enemy.getLifePoints() - hero.getWeaponDamage());
            System.out.println("Enemy : " + enemy.getLifePoints() + " Hp");
            
        } else if (hero.getClass().getName().equals("Hero")) {
            System.out.println(" ");
            System.out.println("Enemy : " + enemy.getLifePoints() + " HP");
            System.out.println("Hero Dammage : " + hero.getWeaponDamage());
            enemy.setLifePoints(enemy.getLifePoints() - hero.getWeaponDamage());
            System.out.println("Enemy : " + enemy.getLifePoints() + " Hp");
            
        }

    }
}
