public class BrandBFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createSmartBulb() throws Exception {
        SmartBulb bulb = new BrandBBulb();
        bulb.setUsage();
        return bulb;
    }

    @Override
    public SmartLock createSmartLock() throws Exception {
        SmartLock lock = new BrandBLock();
        lock.setConsumption();
        return lock;
    }
}
