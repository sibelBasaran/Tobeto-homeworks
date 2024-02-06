import java.util.Scanner;

public class shoppingCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your order quantity: ");
        int orderQuantity = scanner.nextInt();

        double totalAmount = 0;

        for (int i = 1; i <= orderQuantity; i++) {
            double productPrice = 19.99;



            totalAmount += productPrice;
        }

        System.out.println("Total : " +"$"+ totalAmount );
    }
}


