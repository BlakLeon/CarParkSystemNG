package App;

public class Car {
    private String carBrand;
    private String carModel;
    private String carOwner;
    private String carPlate;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public Car(String carBrand, String carModel, String carOwner, String carPlate) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carOwner = carOwner;
        this.carPlate = carPlate;
    }


}
