import java.io.BufferedReader;
import java.io.FileReader;

public abstract class SmartLock {
    protected int batteryConsumption;

    public void setConsumption() throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader("textInput.txt"))) {
            this.batteryConsumption = Integer.parseInt(reader.readLine().trim());
        }
    }

    public int getBatteryConsumption() {
        return batteryConsumption;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [Battery Consumption=" + batteryConsumption + "%]";
    }
}