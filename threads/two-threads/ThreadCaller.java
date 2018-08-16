public class ThreadCaller {
    public static void main(String[] args) {
        Thread firstAction = new FirstAction(); 
        Thread secondAction = new SecondAction(); 

        // these two will run in paralell 
        firstAction.start();
        secondAction.start(); 

        System.out.println("Caller does something else while actions are at work"); 
    }
}