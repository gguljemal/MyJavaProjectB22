package day46_encapsulation;

public class Car {

    //encapsulated instance variables
    private String model; //private here is an access modifier
    private int year;
    private int mileage;

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int carYear) {
        year = carYear;
    }

    public int getYear() {
        return year;
    }

    public void setMileage(int carMileage) {
        mileage = carMileage;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
