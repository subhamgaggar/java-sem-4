package sem4_java;


class FactorialException extends Exception {

    private int inputNumber;

    public FactorialException(String message, int inputNumber) {
        super(message);
        this.inputNumber = inputNumber;
    }

    @Override
    public String toString() {
        return "FactorialException: " + getMessage() + " Input number: " + inputNumber;
    }
}



