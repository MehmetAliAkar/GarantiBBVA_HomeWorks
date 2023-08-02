public class Playstation implements GameController{

    private boolean isOpen;
    public Playstation(){
        this.isOpen = false;
    }
    @Override
    public void addController() {
        System.out.println("Playstation controller added");
    }

    @Override
    public void playGame() {
        if (!isOpen){
            throw new IllegalStateException("Playstation is closed");
        }
        System.out.println("Game started on Playstation");
    }

    public void open(){
        if (isOpen){
            throw new IllegalStateException("Playstation already open.");
        }
        isOpen = true;
        System.out.println("Playstation is now open.");
    }

    public void shutdown(){
        if (!isOpen){
            throw new IllegalStateException("Playstation is already closed.");
        }
        isOpen = false;
        System.out.println("Playstation is now closed.");
    }
}
