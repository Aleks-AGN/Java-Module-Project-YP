public class Formatter {
    public String formatPrice(double price) {
        StringBuilder strBuilder = new StringBuilder();
        String currency;
        int money = (int) price;
        int i = money % 10;

        if (money % 100 >= 11 && money % 100 <= 14) {
            currency = "рублей";
        } else {
            switch (i) {
                case 1:
                    currency = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    currency = "рубля";
                    break;
                default:
                    currency = "рублей";
            }
        }

        strBuilder
                .append(String.format("%.2f", price))
                .append(" ")
                .append(currency);

        return strBuilder.toString();
    }
}
