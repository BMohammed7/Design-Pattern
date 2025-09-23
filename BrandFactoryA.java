public class BrandFactoryA implements SmartDeviceFactory{
    @Override
    public SmartBulb createSmartBulb() throws Exception {
        SmartBulb smartbulb = new BrandASmartBulb();
        smartbulb.setUsage();
        return smartbulb;
    }

    @Override
    public SmartLock createSmartLock() throws Exception {
        SmartLock smartlock = new BrandASmartLock();
        smartlock.setConsumption();
        return smartlock;
    }
}