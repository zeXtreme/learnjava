package me.zwy.work;

public class ProductionWorker extends Worker implements Automation {

	public void makeMaterial() {
		System.out.println("����ԭ����");
	}

	public void process() {
		System.out.println("�ӹ�");
	}

	@Override
	public void useAutomationDevice() {
		System.out.println("ʹ���Զ����豸");
	}
}
