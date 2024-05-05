public class Main {


    public static void main(String[] args) {
        System.out.println("Калькулятор счёта v1.0.");

        InputCalc inputCalc = new InputCalc();
        OutputCalc outputCalc = new OutputCalc();
        Formatter formatter = new Formatter();

        int numberOfGuests = inputCalc.requestNumberOfGuests();
        Calculator calculator = new Calculator(numberOfGuests);

        inputCalc.requestListOfProducts(calculator);
        outputCalc.printCalculatedResult(calculator, formatter);
    }
}