import java.util.ArrayList; 

public class Subject {
    public static void main(String[] args){
        Subject subject = new Subject(); 

        subject.updateObservers(); 
    }

    private ArrayList<Observer> observers; 

    public Subject(){
        observers = new ArrayList<Observer>(); 

        observers.add(new ObserverA()); 
        observers.add(new ObserverB());
        observers.add(new ObserverC());
    }

    public void updateObservers(){
        for(Observer observer : observers){
            observer.update(); 
        }
    }
}