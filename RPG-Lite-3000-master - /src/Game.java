import java.util.Random;
import java.util.Scanner;

public class Game extends InputParser {
    Scanner scanner = new Scanner(System.in);

    protected static String[] heroes = new String[1];
    int playerTurn;

    public static void main(String[] args) throws Exception {
        heroes[0] = StartGame();
        Hunter hero1 = new Hunter(3, 7, 2, 2, 3);
        int nbhero = 1;
        playGame(hero1);
    }

    public static void playGame(Hero hero1) {   // description du jeux
        int j = 1, g , lvl = 1 ;    
        
                                
                                   while (hero1.getLifePoints() > 0) {     // la partie s'arrete si le joueur n'as plus de vie
                                                      
                                       System.out.println(" ");
                                       System.out.println("-------------------");
                                       System.out.println("Combat " + j);
                                       System.out.println("-------------------");
                                       System.out.println(" ");
                                       Enemy enemy = generateCombat(lvl);
                                       Random random = new Random();
                                       int nb = random.nextInt(2);
                                       while (enemy.getLifePoints() > 0 && hero1.getLifePoints() > 0 ) {
                                           combat(enemy, hero1, nb);
                                           
                                       }
                                       if (hero1.getLifePoints() > 0 ) {
                                           winCombat(hero1);
                                           
                                           j++;
                                           
                                       }
                                    }
                                       
                               if (hero1.getLifePoints() <= 0) {
                                   System.out.println(" ");
                                   System.out.println("-------------------");
                                   System.out.println("Vous avez Perdu");
                               }

        }
  


    
    public static Enemy generateCombat(int i) {
        
        Random random = new Random();
        int bi = random.nextInt(2) ;
        if (bi == 0){
            int nombre1 = random.nextInt(2) + 1; // prend un nombre au hazard dans l'intervalle (2,3)
            int nombre2 = random.nextInt(2); // prend un nombre au hazard dans l'intervalle (1)
            int a = nombre1 + i, v = nombre2 + i;
            BasicEnemy enemy = new BasicEnemy(a,v);
            System.out.println("L'ennemi a : " + a+ " points de vie et " + v + " degats");
            
            return enemy;
        }
        else{
            
            int nombre1 = random.nextInt(4) + 5; // prend un nombre au hazard dans l'intervalle (5,6,7,8)
            int nombre2 = random.nextInt(2) + 2; // prend un nombre au hazard dans l'intervalle (2,3)
            int a = nombre1 + i, v = nombre2 + i;
            Boss boss = new Boss(a,v);
            System.out.println("Le Boss a : " + a+ " points de vie, " + v + " degats " );
            
    
            return boss;

        }
        
    }
  

    public static void combat(Enemy enemy, Hero hero, int nb) {

        if (nb == 0) {
            CombatChoice(enemy, hero);
            
        } else {
            Enemy.attackofEnemy(enemy, hero);
            if (hero.getLifePoints() > 0) {
                CombatChoice(enemy, hero);
            }

        }
    }

    public static void winCombat(Hero hero) {
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println("Bravo vous avez gagne votre combat !");
        System.out.println("-------------------");
        System.out.println(" ");
        hero.setArrow(hero.getArrow() + 1);
        WinChoice(hero);
    }
    public static void winBoss(Hero hero) {
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println("Bravo vous avez battu un BOSS !");
        System.out.println("-------------------");
        System.out.println(" ");
        hero.setArrow(hero.getArrow() + 2);
        WinChoiceBoss(hero);
    }

  

}