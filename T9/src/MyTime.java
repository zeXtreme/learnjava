/**
 * �ڳ����У�����Ҫ��ʱ����в��������ǲ�û��ʱ�����͵����ݡ� ��ô�����ǿ����Լ�ʵ��һ��ʱ���࣬����������е���Ҫ��
 * ������ΪMyTime���࣬����Ӧ���������ͳ�Ա��ʱ��hour�����֣�minute�����루second����
 * Ϊ�˱�֤���ݵİ�ȫ�ԣ���������Ա����Ӧ����Ϊ˽�С�ΪMyTime�ඨ�幹�췽����
 * �Է��㴴������ʱ��ʼ����Ա�������ٶ���diaplay���������ڽ�ʱ����Ϣ��ӡ������
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
