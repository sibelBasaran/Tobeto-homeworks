package CleanCode;

import java.util.Scanner;

public class ProductManager implements IProductService{
    private IBankService iBankService;
    public ProductManager(IBankService iBankService){
        this.iBankService = iBankService;
    }
    @Override
    public void sell(Product product, Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - TL ile ödeme yap");
        System.out.println("2 - USD ile ödeme yap");
        int paymentType = scanner.nextInt();
        double price = product.getPrice();
        if(paymentType == 1){
            //  double price = product.getPrice();
            System.out.println("Alışverişiniz için teşekkür ederiz.");
            System.out.println("Toplam tutar: " + product.getPrice());
        }
        else if(paymentType ==2){
            price = product.getPrice();
            CurrencyRate currencyRate = new CurrencyRate(price,1);
            price = iBankService.convertRate(currencyRate);
            System.out.println("Alışverişiniz için teşekkür ederiz.");
            System.out.println("Toplam Tutar: " + price + " USD");
        }
    }
    public void sell(Product product, Student student){
        double price = product.getPrice() * student.getDiscountRate();
        System.out.println("Öğrenci indiriminden %10 indirim kazandınız!");
        System.out.println("Toplam Tutar: " + product.getPrice());
        System.out.println("Öğrenci İndirimli Tutar: " + price);
    }

}
