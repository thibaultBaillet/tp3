package question1;


import java.util.ArrayList;



public abstract class Observable {

    protected ArrayList<Observer> observerList;
    protected int chiffre;
    Observable() {
        this.observerList = new ArrayList<>();
    }

    public void AddObserver(Observer o) {
        this.observerList.add(o);
    }

    public void RemoveObserver(Observer o) {
        this.observerList.remove(o);
    }


    public void setValue(int value) {
        this.chiffre = value;
        this.NotifyObserver();
    }

    public int getValue() {
        return this.chiffre;
    }

    protected abstract void NotifyObserver();
  //      for (Observer o: this.observerList){
  //          o.update(this);
  //      }


}
