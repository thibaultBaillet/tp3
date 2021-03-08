package question1;
//import java.util.Observer;
//import java.util.Observable;

public class Broker implements Observer {

    private boolean valueChanged = false;
    public boolean isChangeDetected() {
        return valueChanged;
    }
    public void update() {
        this.valueChanged = true;
        System.out.println("la valeur à changé " + valueChanged );
    }
}
