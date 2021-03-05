package question2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public abstract class Controller implements ActionListener {

    private View view = null;
    private Number number = null;

    public Controller (Number number, View view){
        this.number = number;
        view.getMoins().addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        Controller.this.number.dec();
                    }
                });
        view.getPlus().addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        Controller.this.number.inc();
                    }
                });


    }


}


