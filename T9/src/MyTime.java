/**
 * 在程序中，经常要对时间进行操作，但是并没有时间类型的数据。 那么，我们可以自己实现一个时间类，来满足程序中的需要。
 * 定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），
 * 为了保证数据的安全性，这三个成员变量应声明为私有。为MyTime类定义构造方法，
 * 以方便创建对象时初始化成员变量。再定义diaplay方法，用于将时间信息打印出来。
 */
public class MyTime {

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public MyTime() {

	}

	int hour, minute, second;

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void display() {
		System.out.println(hour + ":" + minute + ":" + second);
	}

}
