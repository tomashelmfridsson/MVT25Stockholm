package vehicle;

public class Bike extends Vehicle {
    public int gear;

    public boolean gear(int nbr){
        if (nbr > 0 && nbr < 22) {
            this.gear = nbr;
            return true;
        }
        return false;
    }

    public boolean increaseSpeed(int force){
        if (force < 500 && super.speed< 70){
            super.speed += (int) (force*this.gear *0.003);
            return true;
        }
        return false;
    }
}
