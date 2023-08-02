public class AdditionStrategy implements OperationStrategy {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() + num2.getReal();
        double imagPart = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(realPart, imagPart);
    }
}
