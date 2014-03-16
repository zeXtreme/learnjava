package me.zwy;

public class VehicTest {

	public static void main(String[] args) {
		Car c = new Car();

		c.setColor("black");
		c.setSpeed(40);
		c.setPassenger(20);

		System.out.println(c.getColor() + "  " + c.getSpeed() + "  "
				+ c.getPassenger()+c.toString());
	}

}
