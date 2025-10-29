import calculator.controller.CalculatorController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorIntegrationTest {
    @Test
    void testAllOperations() {
        CalculatorController controller = new CalculatorController();
        assertEquals(7, controller.calculate("add", 3, 4));
        assertEquals(1, controller.calculate("sub", 5, 4));
        assertEquals(20, controller.calculate("mul", 5, 4));
        assertEquals(2, controller.calculate("div", 8, 4));
    }
}
