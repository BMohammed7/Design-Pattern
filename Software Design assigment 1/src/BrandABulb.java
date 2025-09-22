public class BrandASmartBulb implements SmartBulb {
    private EnergyDataReader reader = new EnergyDataReader();

    @Override
    public void configureUsage() {
        reader.configureUsage();
    }

    @Override
    public double getPowerUsage() {
        return reader.getEnergyUsage();
    }

    @Override
    public String toString() {
        return "BrandA Smart Bulb - Usage: " + getPowerUsage();
    }
}
