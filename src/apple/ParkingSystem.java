package apple;


public class ParkingSystem {

    int[] spaces = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        this.spaces[0] = big;
        this.spaces[1] = medium;
        this.spaces[2] = small;
    }

    public boolean addCar(int carType) {
        return spaces[carType - 1]-- >0;
    }

    public static void main(String args[]) {
        ParkingSystem pa = new ParkingSystem(1, 1, 0);
        System.out.println(pa.addCar(1));
        System.out.println(pa.addCar(2));
        System.out.println(pa.addCar(3));
        System.out.println(pa.addCar(1));
      /*  pa.addCar(4);
        pa.addCar(1);
        pa.addCar(1);
        pa.addCar(1);
        pa.addCar(3);
        pa.addCar(3);
        pa.addCar(3);
        pa.addCar(3);
        pa.addCar(3);*/
    }
}
