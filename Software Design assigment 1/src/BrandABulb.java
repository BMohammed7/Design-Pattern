public class BrandABulb implements SmartBulb{
    private int powerUsage;

    public BrandABulb() {
        this.powerUsage = loadPowerUsage(); // Factory Method
    }

    private int loadPowerUsage() throws IOException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("bulb_config.properties");
        props.load(fis);
        fis.close();

        String value = props.getProperty("BrandA_Bulb_Power", "60");
        return Integer.parseInt(value);
    }

    @Override
    public void turnOn() {
        System.out.println("Brand A Bulb ON (" + powerUsage + "W)");
    }

    @Override
    public void turnOff() {
        System.out.println("Brand A Bulb OFF");
    }
}
