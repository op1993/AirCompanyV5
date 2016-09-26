package airCompany;

/**
 * Created by Oleh on 21.09.2016.
 */
public class Plane {
    protected float distance;
    protected float capacity;
    String planeName;


    public Plane() {
    }

    public Plane(String planeName, float distance, float capacity) {
        this.distance = distance;
        this.capacity = capacity;
        this.planeName = planeName;

    }

    public float getDistance() {
        return distance;
    }


    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getPlaneName() {
        return planeName;
    }

    public String getInfo() {
        return "Plane name = " + getPlaneName() + "\n"
                + "max distance  = " + getDistance() + "\n"
                + "plane capacity = " + getCapacity() + "\n";
    }
}
