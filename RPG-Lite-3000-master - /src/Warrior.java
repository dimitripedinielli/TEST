public class Warrior extends Hero {
    public int frappe;

    public Warrior(int weaponDamage, int lifePoints, int armor, int potion, int frappe) {
        this.weaponDamage = weaponDamage;
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.potion = potion;
        this.frappe = frappe;
        
    }
    public static void attack(Enemy enemy, Hero hero) {
        if (hero.getClass().getName().equals("Warrior")) {
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
