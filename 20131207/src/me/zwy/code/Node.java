package me.zwy.code;

public class Node {
	
	private Object data;
	private Node next;
	private Node preview;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPreview() {
		return preview;
	}
	public void setPreview(Node preview) {
		this.preview = preview;
	}

}
