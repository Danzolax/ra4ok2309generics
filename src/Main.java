import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Button> buttons = new ArrayList<>();
        buttons.add(new MultButton());
        buttons.add(new DivButton());
        buttons.add(new SubButton());
        buttons.add(new AddButton());
        Calculator calculator = new Calculator();
        calculator.buttons = buttons;
        calculator.readValues();
        calculator.process(OperationTypeEnum.DIV);
        System.out.println(calculator);
    }
}
