package question2;


import java.util.Observable;

public class Number extends Observable{

    private int value;
    public int VALEUR_MIN;
    public int VALEUR_MAX;


    public Number(int value){
        super();
        value = 5;
    }
    public void setValue(int value){
        this.value = value;
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

        }
    }
    public void dec(){
        if(value > VALEUR_MIN){
            this.value--;
            setChanged();
            notifyObservers();

        }
    }



/*    public void addValueListener(ValueListener listener){
        listeners.add(ValueListener.class, listener);
    }
    public void removeVolumeListener(ValueListener l){
        listeners.remove(ValueListener.class, l);
    }
    public void ValueChanged(){
        ValueListener[] listenerList = (ValueListener[])listeners.getListeners(ValueListener.class);

        for(ValueListener listener : listenerList){
            listener.valueChanged(new ValueChangedEvent(this, getValue()));
        }
}*/
/*
public interface  ValueListener extends EventListener{
    public void valueChanged(ValueChangedEvent event);
}

public class ValueChangedEvent extends EventObject{
    private int newValue;

    public ValueChangedEvent(Object source, int newVolume){
        super(source);

        this.newValue = newVolume;
    }

    public int getNewValue(){
        return newValue;
    }*/
}