package question2;

import javax.swing.*;
import java.util.Observer;
import java.util.Observable;

public class View implements Observer {
    public JTextField jTextField;
    public JButton jButton1;
    public JButton jButton2;

    public View(Number number){

        // create the window
        JFrame window = new JFrame();
        // give a title
        window.setTitle("Swing Window");
        // change the size
        window.setSize(400, 100);
        // exit program on window close action
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // center window on screen
        window.setLocationRelativeTo(null);
        // create a panel to include components
        JPanel jPanel = new JPanel();
        // create a textField
        this.jTextField = new JTextField(5);
        // add the textField to the window
        jPanel.add(this.jTextField);
        // create a button
        this.jButton1 = new JButton("+");
        // add the button to the window
        jPanel.add(this.jButton1);
        // create a button
        this.jButton2 = new JButton("-");
        // add the button to the window
        jPanel.add(this.jButton2);
        // add the panel to the window
        window.add(jPanel);
        // display the window
        window.setVisible(true);

        number.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof  Number) {
            Number number = (Number) o;
            this.jTextField.setText(String.valueOf((number.getValue())));

        }
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    public JButton getjButton1(){return jButton1;}
    public JButton getjButton2(){return jButton2;}
}
