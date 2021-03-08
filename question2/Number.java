package question2;


import java.util.Observable;

public class Number extends Observable{

    private int value;
    public int VALEUR_MIN;
    public int VALEUR_MAX;


    public Number(){

    }
    public Number(int value){
        super();
        value = 5;
    }
    public void setValue(int value){
        if((value < VALEUR_MAX)&&(value > VALEUR_MIN)){
            this.value = value;
        }

        setChanged();
        notifyObservers();
    }
    public int getValue(){
        return value;
    }

    public Number(int min, int max){
        this.VALEUR_MIN = this.value = min;
        this.VALEUR_MAX = max;
    }

    public void inc(){
        if(value < VALEUR_MAX){
            this.value++;
            setChanged();
            notifyObservers();

        }else {this.value = VALEUR_MAX; }
    }
    public void dec(){
        if(value > VALEUR_MIN){
            this.value--;
            setChanged();
            notifyObservers();

        }else {this.value = VALEUR_MIN; }
    }
}