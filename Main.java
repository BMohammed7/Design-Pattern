
public class Main {
    public static void main(String[] args) {
        try {
            // Create a Brand A Factory
            SmartDeviceFactory brandFactoryA = new BrandFactoryA();
            SmartBulb smartbulbA = brandFactoryA.createSmartBulb();

            // Create a Brand B Factory
            SmartDeviceFactory brandFactoryB = new BrandFactoryB();
            SmartLock smartlockB = brandFactoryB.createSmartLock();

            System.out.println("Test Driver Results:");
            System.out.println(smartlockB);
            System.out.println(smartbulbA);

        } catch (Exception e) {
            System.out.println("Error while creating devices: " + e.getMessage());
        }
    }}
