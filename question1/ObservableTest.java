package question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObservableTest {
    @Test
    public void checkAddObserver() {
        Cac40 cac40 = new Cac40();
        Broker broker = new Broker();
        cac40.add(broker);
        assertEquals(1, cac40.getObserverCount());
    }

    @Test
    public void checkRemoveObserver() {
        Cac40 cac40 = new Cac40();
        Broker broker = new Broker();
        cac40.add(broker);
        cac40.remove(broker);
        assertEquals(0, cac40.getObserverCount());
    }

    @Test
    public void checkNotify() {
        Cac40 cac40 = new Cac40();
        Broker broker = new Broker();
        cac40.add(broker);
        cac40.setValue(10);
        assertTrue(broker.isChangeDetected());
    }
}
