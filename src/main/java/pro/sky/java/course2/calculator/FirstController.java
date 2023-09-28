package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    private CalculatorService calculatorService;
    public FirstController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String showWelcome(){
        return calculatorService.showWelcome();
    }

    @GetMapping(path = "/calculator/plus")
    public String summa(@RequestParam("num1") int usnum1,@RequestParam("num2")  int usnum2){
        return calculatorService.summa(usnum1,usnum2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int usnum1,@RequestParam("num2")  int usnum2){
        return calculatorService.minus(usnum1,usnum2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int usnum1,@RequestParam("num2")  int usnum2){
        return calculatorService.multiply(usnum1,usnum2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int usnum1,@RequestParam("num2")  int usnum2){
        return calculatorService.divide(usnum1,usnum2);
    }
}
