public abstract class Character {

    private String characterID;
    private double energyLevel;

    protected Character(String id, double energy) {
        characterID = id;
        energyLevel = energy;
    }

    public abstract double calculateRegenRate();

    public void displayInfo() {
        System.out.println("ID: " + characterID + ", Energy: " + energyLevel);
    }

    protected String getCharacterID() {
        return characterID;
    }

    protected double getEnergyLevel() {
        return energyLevel;
    }

    protected void setEnergyLevel(double energy) {
        energyLevel = energy;
    }
}