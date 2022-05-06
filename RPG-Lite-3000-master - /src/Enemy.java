import java.util.Random;

public abstract class Enemy {

    int lifePoints;
    int damage;
    

    public static void attackofEnemy(Enemy enemy, Hero hero) {
        System.out.println(" ");
        System.out.println("Hero : " + hero.getLifePoints() + " HP et "+ hero.getArmor()+ " Def");
        
        int degatsreel =  -1 *enemy.getDamage();
        if(degatsreel<0){
            System.out.println("Enemy Dammage : " + degatsreel);      
            hero.setLifePoints(hero.getLifePoints() + degatsreel);
            System.out.println("Hero : " + hero.getLifePoints()+" HP");
        }
        
            
        
        
    }
    public static void defend(Enemy enemy, Hero hero) {
        System.out.println(" ");
        System.out.println("Hero : " + hero.getLifePoints() + " HP et "+ hero.getArmor()+ " Def");
        
        int degatsreel = (hero.getArmor()) - enemy.getDamage();
        if(degatsreel<0){
            System.out.println("Enemy Dammage : " + degatsreel);      
            hero.setLifePoints(hero.getLifePoints() + degatsreel);
        }
        else enemy.setLifePoints(enemy.getLifePoints() - 1);
        
            
        System.out.println("Hero : " + hero.getLifePoints()+" HP");
        
        }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    

}
