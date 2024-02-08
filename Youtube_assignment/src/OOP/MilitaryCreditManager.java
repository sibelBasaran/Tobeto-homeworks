package OOP;

import OOP.ICreditManager;

public class MilitaryCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Military credit calculated.");
    }

    @Override
    public void save() {
        System.out.println("Military credit accepted.");
    }
}