public class Main {

    public static void main(String[] args) {

        ProductUtils.createTable();

        ProductUtils.updateProduct(2,"Lemon", 5);

        ProductUtils.deleteProduct(1);

        ProductUtils.getAllProduct()
                .stream()
                .forEach(product-> System.out.println(product));




    }

}
