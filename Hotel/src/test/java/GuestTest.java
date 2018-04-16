import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Marta Beveridge");
    }

    @Test
    public void hasName() {
        assertEquals("Marta Beveridge", guest.getName());
    }
}