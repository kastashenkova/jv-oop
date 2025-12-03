package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Pr-pr-pr-pr");
    }

    @Override
    public void stopWork() {
        System.out.println("Pra-a-a");
    }
}
