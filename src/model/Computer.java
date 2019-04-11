package model;

public class Computer {
	private int hd;
	private int ram;
	private String ip;
	
	private Computer previus;
	private Computer Next;
	
	public Computer(int h,int r, String ip) {
		this.hd = h;
		this.ram = r;
		this.ip = ip;
	}
	
	public int getHd() {
		return hd;
	}
	
	public int getRam() {
		return ram;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setPrevious(Computer c) {
		this.previus = c;
	}
	
	public void setNext(Computer c) {
		this.Next = c;
	}
	
	
}
