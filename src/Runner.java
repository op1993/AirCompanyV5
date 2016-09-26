import airCompany.AirCompany;
import airCompany.CargoPlane;
import utils.Calculator;
import utils.DistanceComparatorSorter;
import utils.Searcher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Oleh on 21.09.2016.
 */
public class Runner {

    public static void main(String[] args) {
        AirCompany airCompany = new AirCompany();
        Calculator calculator = new Calculator(airCompany.cargoPlanes);
        airCompany.addCargoPlanes();
        Scanner scanner = new Scanner(System.in);
        boolean loopCondition = true;
        while (loopCondition) {
            System.out.println("Select option: \n" +
                    "0 - Exit \n" +
                    "1 - Get total capacity sum \n" +
                    "2 -  Get total carry Capacity sum \n" +
                    "3 - Get whole information about company planes \n" +
                    "4 - Search plane by name \n "
            );
            int decision = scanner.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("Total capacity sum = " + calculator.capacitySum() + "\n");
                    break;
                case 2:
                    System.out.println("Total carry capacity sum = " + calculator.carryCapacitySum() + "\n");
                    break;

                case 3:
                    showInfoAboutPlanes(airCompany.getCargoPlanes());
                    break;


                case 4:
                    System.out.println("Type a name to search");
                    String planeName = new Scanner(System.in).nextLine();
                    ArrayList <CargoPlane> cargoPlanes = Searcher.findByName(planeName, airCompany.getCargoPlanes());
                    showInfoAboutPlanes(cargoPlanes);
                    break;

                case 5:
                    DistanceComparatorSorter distanceComparator =new DistanceComparatorSorter(airCompany.getCargoPlanes());
                    distanceComparator.sort();
                    showInfoAboutPlanes(airCompany.getCargoPlanes());
                    break;

                case 0:
                    loopCondition = false;
                    System.out.println("Done");
                    break;
            }


//        for (CargoPlane cargoPlane : airCompany.getCargoPlanes()){
//            System.out.println(cargoPlane.getInfo());
//        }


//

        }
    }

    private static void showInfoAboutPlanes(ArrayList<CargoPlane> cargoPlanes) {
        for (CargoPlane cargoPlane : cargoPlanes) {
            System.out.println(cargoPlane.getInfo() );

        }
    }
}
