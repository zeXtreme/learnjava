package me.zwy.work;

public class TransportWorker extends Worker implements UseTransportMachine {

	public void transport() {
		System.out.println("搬运货物");
	}

	@Override
	public void useTransportMchine() {
		System.out.println("使用搬运工具加快效率");
	}

}
