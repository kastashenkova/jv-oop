package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Tr-tr-tr-tr-tr");
    }

    @Override
    public void stopWork() {
        System.out.println("Tra-a-a");
    }
}
