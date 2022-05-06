import java.util.Scanner;
import java.util.Random;

public class InputParser {
    public static String StartGame() {

        Scanner scanner = new Scanner(System.in);
        String HeroesChoice = HeroesChoice(scanner);
        while (HeroesChoice == "False") {
            HeroesChoice = HeroesChoice(scanner);
        }
        return HeroesChoice;
    }

    public static String HeroesChoice(Scanner scanner) {
        System.out.println("Quelle classe veux-tu choisir (Hunter, Warrior, Mage, Healer)? ");
        String HeroesClass = scanner.nextLine();

        if (HeroesClass.equals("Hunter") || HeroesClass.equals("Warrior") || HeroesClass.equals("Mage")
                || HeroesClass.equals("Healer")) {
            return HeroesClass;
        } else {
            return "False";
        }
        
    }

    public static void CombatChoice(Enemy enemy, Hero hero) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Il vous reste "+ hero.getLifePoints() +" PV et "+hero.getArmor()+" amure !");

/* !!!!!!!!!!!!!!!!!!! il faut mettre une boucle pour chaque type de héros pour pouvoir préciser que Hunter lui mettre "Vous avez tant de fleche" et pour le Warrior mettre "Vous avez tant de frappe" meme si le warrior aura un nombre de frappe infini car il attaque au corps a corps */
        
        System.out.println("Vous avez " + hero.getArrow() + " fleches.");
        System.out.println("Vous avez " + hero.getPotion() + " potions.");
        System.out.println("A = attaquer, D = défendre, P = potion");
        
        String action = scanner.nextLine();
        if (action.equals("A")) {
            Hero.attack(enemy, hero);
            
        }
        else if (action.equals("D")) {
            Enemy.defend(enemy, hero);
            
        }
        else if (action.equals("P")) {
            Hero.useConsumable(hero, hero.getPotion());
            
        }

    }

    public static void WinChoice(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Améliorez vos Competences :");
        System.out.println("A = Armure + 1");
        System.out.println("D = Degats de son arme + 1");
        System.out.println("E = Efficacite de la potion et de la nourriture + 1");
        System.out.println("N = Potions ou Nourriture + 1");
        System.out.println("F = Fleches + 1");
        System.out.println(" ");
        System.out.println("Il vous reste "+ hero.getLifePoints() +" PV et "+hero.getArmor()+" amure !");
        System.out.println("Dans votre sac a dos : " + hero.getArrow() + " Fleches et " + hero.getPotion()
                        + " potions !");
        System.out.println(" ");
        System.out.println("Que choisissez-vous ?");
        String win = scanner.nextLine();

        if (win.equals("A")) {
            hero.setArmor(hero.getArmor() + 1);
        } else if (win.equals("D")) {
            hero.setWeaponDammage(hero.getWeaponDamage() + 1);
        } else if (win.equals("E")) {
            hero.efficacite += 1;
        } else if (win.equals("N")) {
            hero.setPotion(hero.getPotion() + 1);
        } else if (win.equals("F")) {
            hero.setArrow(hero.getArrow() + 1);
        }
    }
    public static void WinChoiceBoss(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Améliorez vos Competences :");
        System.out.println("A = Armure + 2");
        System.out.println("D = Degats de son arme + 2");
        System.out.println("E = Efficacite de la potion et de la nourriture + 2");
        System.out.println("N = Potions ou Nourriture + 2");
        System.out.println("F = Fleches + 2");
        System.out.println(" ");
        System.out.println("Il vous reste "+ hero.getLifePoints() +" PV et "+hero.getArmor()+" amure !");
        System.out.println("Dans votre sac a dos : " + hero.getArrow() + " Fleches et " + hero.getPotion()
                        + " potions !");
        System.out.println(" ");
        System.out.println("Que choisissez-vous ?");
        String win = scanner.nextLine();

        if (win.equals("A")) {
            hero.setArmor(hero.getArmor() + 2);
        } else if (win.equals("D")) {
            hero.setWeaponDammage(hero.getWeaponDamage() + 2);
        } else if (win.equals("E")) {
            hero.efficacite += 2;
        } else if (win.equals("N")) {
            hero.setPotion(hero.getPotion() + 2);
        } else if (win.equals("F")) {
            hero.setArrow(hero.getArrow() + 2);
        }
    }


}
