package me.zwy.work;

public class ProductionWorker extends Worker implements Automation {

	public void makeMaterial() {
		System.out.println("制造原材料");
	}

	public void process() {
		System.out.println("加工");
	}

	@Override
	public void useAutomationDevice() {
		System.out.println("使用自动化设备");
	}
}
