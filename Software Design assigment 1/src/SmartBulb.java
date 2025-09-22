import java.io.BufferedReader;
import java.io.FileReader;

public abstract class SmartBulb {
    protected int powerUsage;

    public void setUsage() throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader("textInput.txt"))) {
            this.powerUsage = Integer.parseInt(reader.readLine().trim());
        }
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [Power Usage=" + powerUsage + "W]";
    }
}