public class MultButton  extends Button{
    @Override
    public double process(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    @Override
    public OperationTypeEnum getType() {
        return OperationTypeEnum.MULT;
    }
}
