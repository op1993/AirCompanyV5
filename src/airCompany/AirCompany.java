package airCompany;

import java.util.ArrayList;

/**
 * Created by Oleh on 21.09.2016.
 */
public class AirCompany {

    public ArrayList<CargoPlane> cargoPlanes = new ArrayList<>();

    public ArrayList<CargoPlane> getCargoPlanes() {
        return cargoPlanes;
    }

    public void addCargoPlanes() {
        CargoPlane mria = new CargoPlane("Mria", 7000, 100000, 70000);
        CargoPlane mria1 = new CargoPlane("Mria", 70300, 100000, 70000);
        CargoPlane boening = new CargoPlane("Boening", 734, 89000, 80000);
        CargoPlane an125 = new CargoPlane("An-125 (Ruslan)", 6500, 80000, 5000);

        cargoPlanes.add(mria);
        cargoPlanes.add(boening);
        cargoPlanes.add(an125);
        cargoPlanes.add(mria1);

//       sout();
    }

    public void sout() {
        for (CargoPlane airCompany : cargoPlanes) {
            airCompany.getInfo();
            System.out.println(airCompany.getInfo());
        }
    }
}
