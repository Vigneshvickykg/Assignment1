package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Stop The Car");	
	}
	public void applyGear() {
		System.out.println("Apply The Gear");
		
	}
	public void switchOnAc() {
		System.out.println("Switch On Ac");
	}
	public void applyAccelerate() {
		System.out.println("Speed Up The Car");
	}
	public void fillFuel() {
		System.out.println("Fill The Fuel");
	}
	public static void main(String[] args) {
		Car tata=new Car();
		tata.applyBreak();
		tata.applyGear();
		tata.switchOnAc();
		tata.applyAccelerate();
		tata.fillFuel();
		
	}
}