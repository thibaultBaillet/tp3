package question1;


public class Cac40 extends Observable {

  /*  public void change (){
        NotifyObserver();

    }*/

    public Cac40() {
        super();
    }

        protected void NotifyObserver() {
            for (Observer o : this.observerList) {
                o.update();
            }
        }

}