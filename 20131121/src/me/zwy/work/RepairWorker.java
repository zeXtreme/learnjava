package me.zwy.work;

public class RepairWorker extends Worker implements Automation,
		RepairInformationize {

	public void repair() {
		System.out.println("ά���豸");
	}

	@Override
	public void repairConputer() {
		System.out.println("ά�޵���");
	}

	@Override
	public void useAutomationDevice() {
		System.out.println("ʹ���Զ����豸");
	}

}
