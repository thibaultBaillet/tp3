package question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * To develop this question i recommended you create a temporary Main class
 * that will actually display the JFrame and allow you to see the result
 * Junit creates the frame and performs the action without any delay before to close it
 */
public class MVCTest {
    @Test
    public void testView() {
        Number number = new Number();
        View view = new View(number);
        Controller controller = new Controller(number, view);
        controller.display();
    }

    @Test
    public void testAddButton() {
        Number number = new Number();
        View view = new View(number);
        Controller controller = new Controller(number, view);
        controller.display();
        view.getjButton1().doClick();
        assertEquals(1, number.getValue());
    }

    @Test
    public void testRemoveButton() {
        Number number = new Number();
        View view = new View(number);
        Controller controller = new Controller(number, view);
        controller.display();
        view.getjButton2().doClick();
        assertEquals(-1, number.getValue());
    }

    @Test
    public void testChangeTextField() {
        Number number = new Number();
        View view = new View(number);
        Controller controller = new Controller(number, view);
        controller.display();
        view.getjTextField().setText("20");
        view.getjTextField().postActionEvent(); // this line is just to simulate the key enter after you type in the jTextField
        assertEquals(20, number.getValue());
    }
}
