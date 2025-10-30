package vehicle;

public class Race {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.speed);
        System.out.println(myCar.showSpeed());
        myCar.increaseSpeed(50);
        System.out.println(myCar.speed);
        System.out.println(myCar.showSpeed());
        myCar.speed=87;
        System.out.println(myCar.speed);

        Bike myBike = new Bike();
        System.out.println(myBike.showSpeed());
        if (!myBike.gear(100)) System.out.println("Det gick inte att lägga i växeln");
        myBike.increaseSpeed(100);
        System.out.println(myBike.showSpeed());
        myBike.gear(3);
        myBike.increaseSpeed(200);
        System.out.println(myBike.showSpeed());
        myBike.gear(10);
        myBike.increaseSpeed(400);
        System.out.println(myBike.showSpeed());

    }
}
