import java.util.Locale;
import java.util.Scanner;

public class InputCalc {
    private static final Scanner scanner = new Scanner(System.in);
    public int requestNumberOfGuests() {

        System.out.println("Здравствуйте!\nНа скольких человек желаете разделить счет?");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Введено некорректное значение для подсчёта!\n" +
                        "Введите правильное количество гостей!");
                scanner.nextLine();
            } else {
                int numberOfGuests = scanner.nextInt();
                if (numberOfGuests == 1) {
                    System.out.println("Нет необходимости разделять счет, если вы пришли без друзей!\n" +
                            "Введите правильное количество гостей!");
                } else if (numberOfGuests < 1) {
                    System.out.println("Введено некорректное значение для подсчёта!\n" +
                            "Введите правильное количество гостей!");
                } else {
                    return numberOfGuests;
                }
            }
        }
    }

    public void requestListOfProducts(Calculator calculator) {

        while (true) {
            String productName;
            double productPrice;
            scanner.nextLine();

            while (true) {
                System.out.println("Введите название товара:");

                productName = scanner.nextLine();

                if (calculator.getListNamesOfProducts().contains(productName)) {
                    System.out.println("Данный товар уже был добавлен в список!");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.println("Введите стоимость товара в формате 'рубли.копейки':");
                scanner.useLocale(Locale.US);

                if (!scanner.hasNextDouble()) {
                    System.out.println("Введено некорректное значение стоимости!");
                    scanner.nextLine();
                } else {
                    productPrice = scanner.nextDouble();

                    if (productPrice < 0) {
                        System.out.println("Введено некорректное значение стоимости!");
                        scanner.nextLine();
                    } else {
                        break;
                    }
                }
            }

            calculator.addProduct(new Product(productName, productPrice));

            System.out.println("Товар успешно добавлен!\n" +
                    "Введите команду 'Завершить' если желате закончить ввод\n" +
                    "или какой-либо другой символ, если желаете добавить еще один товар.");

            String command = scanner.next();
            if (command.equalsIgnoreCase("Завершить")) {
                break;
            }
        }
    }
}
