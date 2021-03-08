package question2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {

    private View view = null;
    private Number number = null;

    public Controller (Number number, View view){

        this.view = view;
        this.number = number;
        view.getjButton2().addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        number.dec();
                    }
                });
        view.getjButton1().addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        number.inc();
                    }
                });

        view.getjTextField().addActionListener(actionEvent -> {
            int value = Integer.parseInt(view.getjTextField().getText());
            number.setValue(value);
        });

    }
    public void display(){

    }


}


