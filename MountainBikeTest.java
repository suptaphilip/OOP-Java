package inheritance;

class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;
        
    public Bicycle() {
	}

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }      
}


class MountainBike extends Bicycle {
    // the MountainBike subclass adds one field
    public int seatHeight;

	public MountainBike() {
	}

	public MountainBike(int gear, int speed,int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	public void applyBrake(int decrement) {
        speed -= decrement;
    }
	
	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight 
				+ ", gear=" + gear + ", speed=" + speed + "]";
	}    
}

public class MountainBikeTest {

	public static void main(String[] args) {
		MountainBike mk = new MountainBike(10,20,30);
		System.out.println(mk);
		mk.applyBrake(5);
		
		System.out.println(mk);
		
		mk.speedUp(40);
		System.out.println(mk);
	}

}
