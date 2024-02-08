package OOP;

import OOP.Company;
import OOP.CreditManager;
import OOP.CustomerManager;

public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();  //instance creation

        Company company1 = new Company(1,"San Francisco","Google Inc.",564870);
        Person person1 = new Person(2,"San Francisco","Sibel","Basaran","Turkish");

        //
        CustomerManager customerManager = new CustomerManager(company1,new MilitaryCreditManager());
        customerManager.giveCredit();

        person1.setCity("San Francisco");










    }
}
