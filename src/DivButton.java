public class DivButton extends Button implements OperationalDefective{
    @Override
    public boolean canProcess(double firstValue,double secondValue) {
        if(secondValue == 0){
            return false;
        }
        return true;
    }

    @Override
    public double process(double firstValue, double secondValue) {
        return firstValue / secondValue;
    }

    @Override
    public OperationTypeEnum getType() {
        return OperationTypeEnum.DIV;
    }
}
