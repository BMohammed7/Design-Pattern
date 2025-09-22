public class BrandAFactory implements SmartDeviceFactory{
    @Override
    public SmartBulb createSmartBulb() {
        return new BrandABulb();
    }

    @Override
    public SmartLock createSmartLock() {
        return new BrandALock();
    }
}
