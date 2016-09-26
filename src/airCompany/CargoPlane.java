package airCompany;

/**
 * Created by Oleh on 21.09.2016.
 */
public class CargoPlane extends Plane {

    protected float carryCapacity;

    public CargoPlane(String planeName, float distance, float capacity, float carryCapacity) {
        super(planeName, distance, capacity);
        this.carryCapacity = carryCapacity;
    }

    public CargoPlane() {
    }

    public float getCarryCapacity() {
        return carryCapacity;
    }

    public String getInfo() {
        return super.getInfo() + "Max carry capacity = " + getCarryCapacity() + "\n";

    }


}
