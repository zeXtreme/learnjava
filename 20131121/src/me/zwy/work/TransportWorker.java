package me.zwy.work;

public class TransportWorker extends Worker implements UseTransportMachine {

	public void transport() {
		System.out.println("���˻���");
	}

	@Override
	public void useTransportMchine() {
		System.out.println("ʹ�ð��˹��߼ӿ�Ч��");
	}

}
