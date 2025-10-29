import org.junit.jupiter.api.Test;
import calculator.service.DivService;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivServiceTest {
    @Test
    void testDivideByZero() {
        DivService div = new DivService();
        assertThrows(IllegalArgumentException.class, () -> div.divide(5, 0));
    }
}
