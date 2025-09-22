public class TesterClient {
    public static void main(String[] args) {
        try {
            // Create a Brand A Factory
            SmartDeviceFactory brandAFactory = new BrandAFactory();
            SmartBulb bulbA = brandAFactory.createSmartBulb();

            // Create a Brand B Factory
            SmartDeviceFactory brandBFactory = new BrandBFactory();
            SmartLock lockB = brandBFactory.createSmartLock();

            System.out.println("Test Driver Results:");
            System.out.println(bulbA);
            System.out.println(lockB);

        } catch (Exception e) {
            System.out.println("Error while creating devices: " + e.getMessage());
        }
    }
}