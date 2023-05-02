import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // Print instructions
        System.out.println("1-Espresso      2-Americano");
        System.out.println("3-Cappuccino    4-Tea");

        // Brew drink
        switch (getChoice()) {
            case 1 -> // Espresso
                    dispenseEspresso();
            case 2 -> { // Americano
                dispenseEspresso();
                dispenseWater();
            }
            case 3 -> { // Cappuccino
                dispenseEspresso();
                dispenseFrothedMilk();
            }
            case 4 -> { // Tea
                heatUpWater();
                dispenseWater();
            }
        }

        // Indicate completion
        System.out.println("Your drink is ready. Caution, hot content!");
    }

    private static byte getChoice() {
        // Take acceptable choice from user
        Scanner scanner = new Scanner(System.in);
        byte input;
        do {
            System.out.print("Choose your drink [1-4]: ");
            input = scanner.nextByte();
        } while (input < 1 || input > 4);
        scanner.close();
        return input;
    }

    private static void dispenseEspresso() {
        heatUpWater();
        grindCoffeeBeans();
        System.out.println(">Dispensing Espresso");
    }
    private static void dispenseWater() {
        System.out.println(">Dispensing Water");
    }
    private static void dispenseFrothedMilk() {
        frothingMilk();
        System.out.println(">Dispensing Frothed Milk");
    }

    private static void heatUpWater() {
        System.out.println(">Heating Water");
    }
    private static void grindCoffeeBeans() {
        System.out.println(">Grinding Coffee Beans");
    }
    private static void frothingMilk() {
        System.out.println(">Frothing Milk");
    }
}
