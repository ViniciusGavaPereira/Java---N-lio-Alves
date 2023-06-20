import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Product produto = new Product();

        produto.setName("TV");

        System.out.println(produto.toString());
      
    }
}
