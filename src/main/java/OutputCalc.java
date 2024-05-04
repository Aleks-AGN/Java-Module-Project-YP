public class OutputCalc {

    public void printCalculatedResult(Calculator calculator, Formatter formatter) {
        System.out.println("Добавленные товары:");

        for (Product product : calculator.getListOfProducts()) {
            System.out.println(product.getName() + " - " + formatter.formatPrice(product.getPrice()));
        }

        System.out.println("Каждый из " + calculator.getNumberOfGuests() +
                " гостей должен заплатить " + formatter.formatPrice(calculator.getPersonalCheck()));
    }
}
