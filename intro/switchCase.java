import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your order number: ");
        int orderNumber = scanner.nextInt();

        String orderName;
        switch (orderNumber){
            case 1:
                orderName="Inari";
                break;
            case 2:
                orderName="Taco";
                break;
            case 3:
                orderName="Sake";
                break;
            case 4:
                orderName="Magura";
                break;
            case 5:
                orderName="Maki";
            case 6:
                orderName="Unagi";
                break;
            default:
                orderName="Invalid order name!";
        }
        System.out.println("Your order list: "+orderName);
    }
}
