//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";

        manager.add(product);

        ProductValidator productValidator = new ProductValidator();
        productValidator.bisey();

        //Inner Class
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connecion.createConnection();

    }
}