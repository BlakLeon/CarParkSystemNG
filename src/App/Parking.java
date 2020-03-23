package App;

import java.util.ArrayList;

public class Parking {
    private String parkName;
    private Boolean isFull;

    private ArrayList<Car> carList;

    public Parking(String parkName, Boolean isFull, ArrayList<Car> carList) {
        this.parkName = parkName;
        this.isFull = isFull;
        this.carList = new ArrayList<Car>();
    }

    public Parking(){
        carList= new ArrayList<Car>();
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public Boolean getFull() {
        return isFull;
    }

    public void setFull(Boolean full) {
        isFull = full;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }


}
