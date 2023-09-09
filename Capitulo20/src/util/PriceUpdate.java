package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product> {


    @Override
    public void accept(Product p) {
        
        
        p.setPrice((double)Math.round(p.getPrice() * 1.1));
    
        
    
    }
    
}
