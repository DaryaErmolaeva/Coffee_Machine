package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void info (int water, int milk, int beans, int cups, int money) {
        System.out.println("\nThe coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                "$" + money + " of money\n");
    }

    public static int takeMoney(int money) {
        System.out.println("\nI gave you $" + money + "\n");
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();
        while (!action.equals("exit")) {
            switch (action) {
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    switch (scanner.nextLine()) {
                        case "1":
                            if (water >= 250 && beans >= 16 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= 250;
                                beans -= 16;
                                cups--;
                                money += 4;
                            } else {
                                if (water < 250) {
                                    System.out.println("Sorry, not enough water!\n");
                                    break;
                                }
                                if (beans < 16) {
                                    System.out.println("Sorry, not enough coffee beans!\n");
                                    break;
                                }
                                if (cups == 1) {
                                    System.out.println("Sorry, not enough disposable cups!\n");
                                    break;
                                }
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups--;
                                money += 7;
                            } else {
                                if (water < 350) {
                                    System.out.println("Sorry, not enough water!\n");
                                    break;
                                }
                                if (milk < 75) {
                                    System.out.println("Sorry, not enough milk!\n");
                                    break;
                                }
                                if (beans < 20) {
                                    System.out.println("Sorry, not enough coffee beans!\n");
                                    break;
                                }
                                if (cups == 0) {
                                    System.out.println("Sorry, not enough disposable cups!\n");
                                    break;
                                }
                            }
                            break;
                        case "3":
                            if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups--;
                                money += 6;
                            } else {
                                if (water < 200) {
                                    System.out.println("Sorry, not enough water!\n");
                                    break;
                                }
                                if (milk < 100) {
                                    System.out.println("Sorry, not enough milk!\n");
                                    break;
                                }
                                if (beans < 12) {
                                    System.out.println("Sorry, not enough coffee beans!\n");
                                    break;
                                }
                                if (cups == 0) {
                                    System.out.println("Sorry, not enough disposable cups!\n");
                                    break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("\nWrite how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups do you want to add:");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    money = takeMoney(money);
                    break;
                case "remaining":
                    info(water, milk, beans, cups, money);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();
        }
    }
}
