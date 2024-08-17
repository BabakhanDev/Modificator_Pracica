package task2;

import java.util.Arrays;

public class Avtosalon {
    private long id;
    private String avtoName;
    private Car[] cars;

    public Avtosalon(long id, String avtoName, Car[] cars) {
        this.id = id;
        this.avtoName = avtoName;
        this.cars = cars;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvtoName() {
        return avtoName;
    }

    public void setAvtoName(String avtoName) {
        this.avtoName = avtoName;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
    //  ADD
    public void addCar(Car car){
        int newSize = cars.length+1;
        cars=Arrays.copyOf(cars,newSize);
        cars [newSize-1] = car;
    }
    // get All
    public void getAllCar(){
        for (Car cararray : cars) {
            System.out.println(cararray);
        }
    }
    //Find By ID
    public Car getCartById(Long carId){
        for (Car carid : cars) {
           if (carid.getId().equals(carId)){
               return carid;
            }
        }
        return null;
    }
    // Delete By ID
    public void deleteCar(Long carId){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(carId)){
                cars[i] = cars[cars.length - 1];
                cars = Arrays.copyOf(cars,cars.length-1);
                break;
            }

        }
    }

//    updateCar
    public void updateCar(Long carId,Car newCar){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(carId)){
                cars[i] = newCar;
                break;
            }
        }
    }
    public void updateCarModel (Long carId, String model){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(carId)){
                cars[i].setModel(model);
            }

        }
    }

    @Override
    public String toString() {
        return "Avtosalon{" +
                "id=" + id +
                ", avtoName='" + avtoName + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
