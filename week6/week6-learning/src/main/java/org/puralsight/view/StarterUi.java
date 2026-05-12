package org.puralsight.view;

import org.puralsight.SoundPlayer;
import org.puralsight.model.Fighter;
import org.puralsight.model.Namekian;
import org.puralsight.model.Saiyan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StarterUi {

    static ArrayList<Fighter> team = new ArrayList<>();
    
    public void start() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menuList();
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    createSaiyan(scanner);
                    break;

                case 2:
                    createNamekian(scanner);
                    break;

                case 3:
                    viewTeam();
                    break;

                case 4:
                    calculateTotalPower();
                    break;

                case 5:
                    startBattle();
                    break;

                case 6:
                    saveBattleReport();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }

    public void menuList(){
        System.out.println("\n========= DRAGON BALL TEAM MENU =========");
        System.out.println("1) Create Saiyan");
        System.out.println("2) Create Namekian");
        System.out.println("3) View Team");
        System.out.println("4) Calculate Total Team Power");
        System.out.println("5) Start Battle");
        System.out.println("6) Save Battle Report");
        System.out.println("0) Exit");
    }
    // OPTION 1
    public static void createSaiyan(Scanner scanner) {

        try {
            System.out.print("Enter Saiyan name: ");
            String name = scanner.nextLine();

            System.out.print("Enter power level: ");
            int power = scanner.nextInt();

            System.out.print("Enter health: ");
            int health = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            Fighter saiyan = new Saiyan(name, power, health);
            team.add(saiyan);

            System.out.println("Saiyan created successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers for power and health.");
            scanner.nextLine(); // clear bad input to avoid infinite loop
        }
    }

    // OPTION 2
    public static void createNamekian(Scanner scanner) {

        try {
            System.out.print("Enter Namekian name: ");
            String name = scanner.nextLine();

            System.out.print("Enter power level: ");
            int power = scanner.nextInt();

            System.out.print("Enter health: ");
            int health = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            Fighter namekian = new Namekian(name, power, health);
            team.add(namekian);

            System.out.println("Namekian created successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values for power and health.");
            scanner.nextLine(); // clears wrong input
        }
    }

    // OPTION 3
    public static void viewTeam() {

        if (team.isEmpty()) {
            System.out.println("Team is empty.");
            return;
        }

        System.out.println("\n===== TEAM MEMBERS =====");

        for (Fighter fighter : team) {

            System.out.println("-------------------");
            System.out.println("Name: " + fighter.getName());
            System.out.println("Power Level: " + fighter.getPowerLevel());
            System.out.println("Health: " + fighter.getHealth());
        }
    }

    // OPTION 4
    public static void calculateTotalPower() {

        int totalPower = 0;

        for (Fighter fighter : team) {
            totalPower += fighter.getPowerLevel();
        }

        System.out.println("Total Team Power: " + totalPower);
    }

    // OPTION 5
    public static void startBattle() throws InterruptedException {

//        if (team.isEmpty()) {
//            System.out.println("No fighters available.");
//            return;
//        }
//
//        System.out.println("Battle Started!");
//
//        for (Fighter fighter : team) {
//
//            System.out.println(fighter.getName() + " is fighting!");
//            fighter.attack();
//            SoundPlayer.playSound("week6/week6-learning/sounds/goku-kamehameha-sound-effect.wav");
//            Thread.sleep(3000);
//            fighter.takeDamage(20);
//            if(fighter instanceof Saiyan saiyan) {
//                saiyan.transform();
//            }
//
//            if(fighter instanceof Namekian namekian){
//                namekian.regenerate();
//            }
//
//        }
//
//        System.out.println("Battle Finished!");
        if (team.isEmpty()) {
            System.out.println("No fighters available.");
            return;
        }

        System.out.println("🔥 Battle Started!");

        Random random = new Random();

        while (team.size() > 1) {

            for (int i = 0; i < team.size(); i++) {

                Fighter fighter = team.get(i);

                if (fighter.isDead()) {
                    continue;
                }

                System.out.println("\n" + fighter.getName() + " is taking action!");

                // Attack action
                Fighter target = team.get(random.nextInt(team.size()));

                if (target == fighter || target.isDead()) {
                    continue;
                }

                fighter.attack();
                int damage = fighter.getPowerLevel();
                System.out.println(fighter.getName() + " attacks " + target.getName() + " for " + damage);

                target.takeDamage(damage);

//                SoundPlayer.playSound("week6/week6-learning/sounds/goku-kamehameha-sound-effect.wav");

                // Special abilities (better handled)
                fighter.useSpecialAbility();

                Thread.sleep(1000);

                // Remove dead fighters
                if (target.isDead()) {
                    System.out.println("💀 " + target.getName() + " has been defeated!");
                }
            }

            // Remove dead fighters from team
            team.removeIf(Fighter::isDead);
        }

        System.out.println("\n🏆 Battle Finished!");

        if (!team.isEmpty()) {
            System.out.println("Winner: " + team.get(0).getName());
        }
    }

    // OPTION 6
    public static void saveBattleReport() {

        System.out.println("Battle report saved successfully.");
    }
}
