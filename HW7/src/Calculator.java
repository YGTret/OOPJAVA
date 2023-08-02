public class Calculator {
    private ComplexNumber currentResult;
    private OperationStrategy currentOperation;

    public void setOperation(OperationStrategy operation) {
        this.currentOperation = operation;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        if (currentOperation == null) {
            throw new IllegalStateException("Operation not set. Call setOperation() first.");
        }
        currentResult = currentOperation.operate(num1, num2);
        return currentResult;
    }

    public ComplexNumber getCurrentResult() {
        return currentResult;
    }
}
