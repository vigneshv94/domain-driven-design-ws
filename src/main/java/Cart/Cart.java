package Cart;

import java.util.ArrayList;
import java.util.List;

import Product.Product;

public class Cart {
    List<Product> productList = new ArrayList<Product>();

    Cart() {
    }

    public void add(Product product) {
        this.productList.add(product);
    }
}
