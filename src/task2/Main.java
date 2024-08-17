package task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car(1L, "Tesla", "Model X", "White", 35000, LocalDate.of(2024, 12, 2), 4),
                new Car(2L, "Toyota", "Prius", "Grey", 25000, LocalDate.of(2023, 12, 22), 2),
                new Car(3L, "Honda", "Pilot", "White", 15000, LocalDate.of(2020, 10, 12), 3)
        };
        Avtosalon avtosalon = new Avtosalon(1L, "ASKAR AutoKG", cars);
        avtosalon.addCar(new Car(4L, "Lexus", "600", "White", 100000, LocalDate.of(2024, 11, 25), 5.0));
        avtosalon.getAllCar();
        System.out.println("..............");
        System.out.println(avtosalon.getCartById(4L));
        System.out.println("..............");
        avtosalon.deleteCar(2L);
        avtosalon.getAllCar();
        System.out.println("..............");
        avtosalon.updateCar(3L,new Car(5L,"Nissan","Serena","Black",12000, LocalDate.of(2015,06,22),2.0));
        avtosalon.getAllCar();
        avtosalon.updateCarModel(1L,"Model S");
        System.out.println("..............");
        avtosalon.getAllCar();

    }
}

