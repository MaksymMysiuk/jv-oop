package core.basesyntax;

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped.");
    }
}