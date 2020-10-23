import java.util.List;
import java.util.Scanner;

public class Calculator {
    List<Button> buttons;
    double firstValue;
    double secondValue;
    double result;
    public void readValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        this.firstValue = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите второе число: ");
        this.secondValue = Double.parseDouble(scanner.nextLine());
    }
    public void process(OperationTypeEnum type){
        for (Button button : buttons) {
            if (button.getType() == type && button instanceof OperationalDefective){
                if(((OperationalDefective) button).canProcess(this.firstValue,this.secondValue)){
                    this.result = button.process(this.firstValue,this.secondValue);
                    return;
                } else{
                    throw new RuntimeException("деление на ноль");
                }

            } else if(button.getType() == type){
                this.result = button.process(this.firstValue,this.secondValue);
                return;
            }
        }
        throw new RuntimeException("нет кнопки");
    }

    public void clear(){
        this.firstValue = 0;
        this.secondValue = 0;
        this.result = 0;
    }

    @Override
    public String toString() {
        return "result: " + this.result;
    }
}
