package week1.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("Send The New Message");
	}
	public void shareDocument() {
		System.out.println("Share The Document");
	}
	public void call() {
		System.out.println("Make a Call");
	}
	public void useCamera() {
		System.out.println("Take a Picture");
	}
	public void flashOn() {
		System.out.println("Turn On Flash");
	}
	public static void main(String[] args) {
		Mobile redmi=new Mobile();
		redmi.sendMessage();
		redmi.shareDocument();
		redmi.call();
		redmi.useCamera();
		redmi.flashOn();
		
	}
	

}
