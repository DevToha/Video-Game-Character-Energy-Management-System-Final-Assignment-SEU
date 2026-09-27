public class PlayerCharacter extends Character {

    private String playerName;

    public PlayerCharacter(String id, double energy, String name) {
        super(id, energy);
        if (energy < 0) {
            setEnergyLevel(0);
        }
        playerName = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String name) {
        playerName = name;
    }

    public double calculateRegenRate() {
        return 0.0;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name: " + playerName);
    }

    public void restoreEnergy(int amount) {
        setEnergyLevel(getEnergyLevel() + amount);
        System.out.println(playerName + " got " + amount + " energy back, now has " + getEnergyLevel());
    }

    public void restoreEnergy(double amount) {
        setEnergyLevel(getEnergyLevel() + amount);
        System.out.println(playerName + " got " + amount + " energy back, now has " + getEnergyLevel());
    }

    public void useEnergy(double amount) throws InsufficientEnergyException {
        if (amount > getEnergyLevel()) {
            throw new InsufficientEnergyException(playerName + " does not have enough energy for " + amount);
        }
        setEnergyLevel(getEnergyLevel() - amount);
        System.out.println(playerName + " used " + amount + " energy, left with " + getEnergyLevel());
    }
}