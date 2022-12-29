package recipe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {


    private Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, Integer count){
        if (count<=0){
            count = 1;
        }
        products.put(product, count);
    }

    public Double getFullPrice(Product product) {
        return product.getCount() * product.getPrice();
    }


}
