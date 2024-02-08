package CleanCode;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Laptop",3700.0);
        Product product2 = new Product(2,"PS-5",1500.0);

        Customer customer1 = new Customer(1,"Larry Page");
        Student customer2 = new Student(2,"Sergey Brin");

        IBankService iBankService = new CentralBankService();
        ProductManager productManager = new ProductManager(iBankService);
        System.out.println("************");


        productManager.sell(product1,customer1);




    }

}
