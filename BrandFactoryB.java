public class BrandFactoryB implements SmartDeviceFactory {
    @Override
    public SmartBulb createSmartBulb() throws Exception {
        SmartBulb smartbulb = new BrandBSmartBulb();
        smartbulb.setUsage();
        return smartbulb;
    }

    @Override
    public SmartLock createSmartLock() throws Exception {
        SmartLock smartlock = new BrandBSmartLock();
        smartlock.setConsumption();
        return smartlock;
    }
}