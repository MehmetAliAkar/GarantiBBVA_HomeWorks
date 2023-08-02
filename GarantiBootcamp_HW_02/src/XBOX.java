public class XBOX implements GameController{

    private boolean isOpen;

    public  XBOX(){
        this.isOpen = false;
    }
    @Override
    public void addController() {
        System.out.println("Xbox controller added");
    }

    @Override
    public void playGame() {
        if (!isOpen){
            throw new IllegalStateException("Xbox already open.");
        }
        isOpen = true;
        System.out.println("Xbox is now open");
    }

    public void shutDown(){
        if (!isOpen){
            throw new IllegalStateException("Xbox is already open");
        }
        isOpen = false;
        System.out.println("Xbox is now closed");
    }


}
