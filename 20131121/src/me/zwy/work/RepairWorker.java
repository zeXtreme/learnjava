package me.zwy.work;

public class RepairWorker extends Worker implements Automation,
		RepairInformationize {

	public void repair() {
		System.out.println("维修设备");
	}

	@Override
	public void repairConputer() {
		System.out.println("维修电脑");
	}

	@Override
	public void useAutomationDevice() {
		System.out.println("使用自动化设备");
	}

}
