import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("tv", 200.00));
        products.add(new Product("carro", 300.00));
        products.add(new Product("tatu", 300.00));


        ProductService ps = new ProductService();

                            //construtor exige uma lista e um predicate.
        double soma = ps.filter(products, p -> p.getName().charAt(0) == 't');

        System.out.println("Soma " + String.format("%.2f", soma));



    }
}