/**
 * ������ΪNumber���࣬�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С� ��д���췽�������� n1��n2��ʼֵ����Ϊ���ඨ��ӣ�addition����
 * ����subtration�����ˣ�multiplication������ ��division���ȹ��г�Ա������ �ֱ��������Ա����ִ�мӡ������ˡ��������㡣
 * ��main�����д���Number��Ķ��󣬵��ø�������������ʾ��������
 */
public class Number {

	public Number(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public Number() {

	}

	private int n1, n2;

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int addition() {
		return n1 + n2;
	}

	public int subtration() {
		return n1 - n2;
	}

	public int multiplication() {
		return n1 * n2;
	}

	public int division() {
		return n1 / n2;
	}

}
