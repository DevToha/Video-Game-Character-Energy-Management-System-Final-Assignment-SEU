public class Mage extends PlayerCharacter {

    public Mage(String id, double energy, String name) {
        super(id, energy, name);
    }

    public double calculateRegenRate() {
        return 5.0;
    }

    public void displayInfo() {
        super.displayInfo();
        double regen = getEnergyLevel() * calculateRegenRate() / 100;
        System.out.println("Class: Mage, Regen Rate: " + calculateRegenRate() + "%, Regen Amount: " + regen);
    }
}