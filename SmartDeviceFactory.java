public interface SmartDeviceFactory {
    SmartBulb createSmartBulb() throws Exception;
    SmartLock createSmartLock() throws Exception;
}