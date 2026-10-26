package ua.opnu.list;
public class Main3 {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        System.out.println(java.util.Arrays.toString(myPhone.getCoordinates()));
    }
}

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

class Smartphone implements GPS, Cellular {

    @Override
    public void makeCall() {
        System.out.println("Calling...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Incoming call...");
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{67.67, 8008.5};
    }
}