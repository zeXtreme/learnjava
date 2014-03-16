public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle car = new Vehicle();

		car.setSpeed(40);
		car.setWeight(2);
		System.out.println(car.getSpeed());
		System.out.println(car.getWeight());
		car.move();
		int nowSpeed;
		nowSpeed = car.speedUp(20);
		System.out.println(nowSpeed);
		nowSpeed = car.speedDown(20);
		System.out.println(nowSpeed);

	}

}

class Vehicle {
	private int speed;
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void move() {
		System.out.println("¿ªÊ¼ÒÆ¶¯");
	}

	public int speedUp(int speedUp) {
		int nowSpeed = speed + speedUp;
		return nowSpeed;
	}

	public int speedDown(int speedDown) {
		int nowSpeed = speed - speedDown;
		return nowSpeed;
	}
}
