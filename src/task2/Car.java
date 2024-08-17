package task2;

import java.time.LocalDate;

public class Car {
//    Car деген класс тузобуз полелери
//            ( id, marka, model, color, price,
//              year, volume(объем ));
//    AvtoSalon деген класс полелери (id,avtoName,
//                                    Car[] cars);
//    main  методдорду чакырып иштетебиз.
//    Бир метод тузобуз кайсы машына эн орточо
//    баада.
//    public void addCar(Car car);
//    public void getAllCar();
//    public Student getCartById(Long carId)
//    public void deleteCar(Long carId)
//    public void updateCar(Long carId,
//                          Car newCar);
    private long id;
    private String marka;
    private String model;
    private String color;
    private int price;
    private LocalDate year;
    private double V;

    public Car(Long id, String marka, String model, String color, int price, LocalDate year, double v) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        V = v;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public double getV() {
        return V;
    }

    public void setV(double v) {
        V = v;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", V=" + V +
                '}';
    }
}
