import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final int numberOfGuests;
    private List<Product> listOfProducts = new ArrayList<>();
    private ArrayList<String> listNamesOfProducts = new ArrayList<>();
    private double totalAmount;

    public Calculator(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void addProduct(Product product) {
        listOfProducts.add(product);
        listNamesOfProducts.add(product.getName());
        totalAmount += product.getPrice();
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public ArrayList<String> getListNamesOfProducts() {
        return listNamesOfProducts;
    }

    public double getPersonalCheck() {
        return totalAmount / numberOfGuests;
    }
}
