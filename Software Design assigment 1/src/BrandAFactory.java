public class BrandFactoryA implements DeviceFactory {
    @Override
    public SmartBulb createBulb() {
        return new BrandASmartBulb();
    }

    @Override
    public SmartLock createLock() {
        return new BrandASmartLock();
    }
}
