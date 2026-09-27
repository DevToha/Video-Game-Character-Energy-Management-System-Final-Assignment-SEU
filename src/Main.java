public class Main {

    public static void main(String[] args) {

        Mage mage = new Mage("C001", 50, "Gandalf");
        Warrior warrior = new Warrior("C002", 80, "Conan");

        Character[] arr = new Character[2];
        arr[0] = mage;
        arr[1] = warrior;

        System.out.println("Showing character info using array (runtime polymorphism)");
        for (Character c : arr) {
            c.displayInfo();
            System.out.println("Regen rate: " + c.calculateRegenRate() + "%");
            System.out.println();
        }

        System.out.println("Now testing overloaded restoreEnergy methods");
        PlayerCharacter p = mage;
        p.restoreEnergy(10);
        p.restoreEnergy(5.5);
        System.out.println();

        System.out.println("Testing exception with try catch finally");
        try {
            warrior.useEnergy(1000);
        } catch (InsufficientEnergyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Warrior energy is now: " + warrior.getEnergyLevel());
        }
        System.out.println();

        System.out.println("Testing multi catch block");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            warrior.useEnergy(result);
        } catch (InsufficientEnergyException | ArithmeticException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}