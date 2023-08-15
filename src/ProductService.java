import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filter(List<Product> list, Predicate<Product> criteria) {
        double soma = 0.0;

        for (Product p : list) {
            if (criteria.test(p))
                soma += p.getPrice();
        }
        return soma;
    }


}
