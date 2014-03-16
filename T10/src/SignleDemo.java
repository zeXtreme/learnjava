//µ¥ÀýÄ£Ê½
public class SignleDemo {

	private SignleDemo() {
	}

	private static SignleDemo signle = null;

	public static SignleDemo creatSignleDemo() {
		if (signle == null) {
			signle = new SignleDemo();
		}
		return signle;
	}

}
