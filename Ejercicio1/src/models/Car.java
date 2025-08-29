package models;

public class Car {

   public String carModel;
   public String carBrand;
   public int carYear;

    public String showCarData() {
        return "Model: " + carModel + ", Brand: " + carBrand + ", Year: " + carYear;
    }
}
