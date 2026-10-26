package ua.opnu.list;
public class Main4 {
    public static void main(String[] args) {
        Car myCar = new Car(67000, 2019, 220);
        Car yourCar = new Car(69000, 2017, 210);
        System.out.println(myCar.compareTo(yourCar));
    }
}

class Car implements Comparable {
    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    // Додайте конструктор з трьома аргументами
    public Car (int price, int year, int horsePower){
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Додайте гетери та сетери
    public int getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    @Override
    public int compareTo(Object obj) {
        Car myCar = (Car) obj;
        Car yourCar = (Car) obj;
        if (this.price != yourCar.price) {
            return yourCar.price - this.price;
        }

        if (this.year != yourCar.year) {
            return this.year - yourCar.year;
        }

        else {
            return this.horsePower - yourCar.horsePower;
        }
    }
}