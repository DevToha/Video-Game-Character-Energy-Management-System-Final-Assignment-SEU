public class Warrior extends PlayerCharacter {

    public Warrior(String id, double energy, String name) {
        super(id, energy, name);
    }

    public double calculateRegenRate() {
        return 2.0;
    }

    public void displayInfo() {
        super.displayInfo();
        double regen = getEnergyLevel() * calculateRegenRate() / 100;
        System.out.println("Class: Warrior, Regen Rate: " + calculateRegenRate() + "%, Regen Amount: " + regen);
    }
}