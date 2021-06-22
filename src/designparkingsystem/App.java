package designparkingsystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        ParkingSystem park = new ParkingSystem(1, 1, 0);

        System.out.println(park.addCar(1));
        System.out.println(park.addCar(2));

        System.out.println(park.addCar(3));


    }


    public static class ParkingSystem {
        int big = 1;
        int medium = 2;
        int small = 3;
        int bigP;
        int mediumP;
        int smallP;

        public ParkingSystem(int big, int medium, int small) {

            this.bigP = big;
            this.mediumP = medium;
            this.smallP = small;
        }

        public boolean addCar(int carType) {
            if (carType == small && smallP >= 1) {
                smallP--;
                return true;
            } else if (carType == medium && mediumP >= 1) {
                mediumP--;
                return true;
            } else if (carType == big && bigP >= 1) {
                bigP--;
                return true;
            }
            return false;
        }
    }
}


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */