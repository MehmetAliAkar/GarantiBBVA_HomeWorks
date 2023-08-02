public class Computer {
    private boolean isOpen;

    public Computer() {
        this.isOpen = false;
    }

    public void open() {
        if (isOpen) {
            throw new IllegalStateException("Computer is already open.");
        }
        isOpen = true;
        System.out.println("Computer is now open.");
    }

    public void shutdown() {
        if (!isOpen) {
            throw new IllegalStateException("Computer is already closed.");
        }
        isOpen = false;
        System.out.println("Computer is now closed.");
    }
}
