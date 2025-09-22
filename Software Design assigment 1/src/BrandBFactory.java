public class BrandBFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createSmartBulb() {
        return new BrandBBulb();
    }

    @Override
    public SmartLock createSmartLock() {
        return new BrandBLock();
    }
}
