package calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import calculator.service.AddService;
import calculator.service.DivService;
import calculator.service.MulService;
import calculator.service.SubService;

@RestController
@RequestMapping("/api")
public class CalculatorController {
    private final AddService add = new AddService();
    private final SubService sub = new SubService();
    private final MulService mul = new MulService();
    private final DivService div = new DivService();

    @GetMapping("/calculate")
    public int calculate(@RequestParam("op") String operation,
                         @RequestParam int a,
                         @RequestParam int b) {
        switch(operation.toLowerCase()) {
            case "add":
                return add.add(a, b);
            case "sub":
                return sub.subtract(a, b);
            case "mul":
                return mul.multiply(a, b);
            case "div":
                return div.divide(a, b);
            default:
                throw new IllegalArgumentException("Nepoznata operacija: " + operation);
        }
    }
}
