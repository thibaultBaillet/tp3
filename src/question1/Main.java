package question1;

import question2.Controller;
import question2.Number;
import question2.View;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    public static void main(String[] arg) {


        // QUESTION 1 test
        /*
        Cac40 cac40 = new Cac40();
        Broker broker = new Broker();
        cac40.setValue(10);
        cac40.AddObserver(broker);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){

                e.printStackTrace();
            }

            System.out.println("La valeur du cac40 est : "+ cac40.getValue());
            cac40.setValue(20);
            System.out.println("La valeur du cac40 est : "+ cac40.getValue());
 */
        // QUESTION 2 test
        Number number = new Number(0,100);
        View view = new View(number);
        Controller controller = new Controller(number, view) {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        view.getjTextField().addActionListener(actionEvent -> {
            int value = Integer.parseInt(view.getjTextField().getText());
            number.setValue(value);
        });

    }
}
