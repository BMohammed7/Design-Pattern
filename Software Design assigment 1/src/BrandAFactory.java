public class BrandFactoryA implements SmartDeviceFactory {
    @Override
    public SmartBulb createBulb() {
        return new BrandASmartBulb();
    }

    @Override
    public SmartLock createLock() {
        return new BrandASmartLock();
    }
}

