public class BrandAFactory implements SmartDeviceFactory{
    @Override
    public SmartBulb createSmartBulb() throws Exception {
        SmartBulb bulb = new BrandABulb();
        bulb.setUsage();
        return bulb;
    }

    @Override
    public SmartLock createSmartLock() throws Exception {
        SmartLock lock = new BrandALock();
        lock.setConsumption();
        return lock;
    }
}
