import org.junit.jupiter.api.Test;
import calculator.service.AddService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddServiceTest {
    @Test
    void testAdd() {
        AddService service = new AddService();
        assertEquals(5, service.add(2, 3));
    }
}
