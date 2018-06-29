package com.marlabs.Inheritance;

class Phone{
	void dial() {
		System.out.println("Dialing");
	}
	void sendSms() {
		System.out.println("sending sms");
	}
}
class CameraPhone extends Phone{
	void capturedPhoto() {
		System.out.println("capturing");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Phone ph=new Phone();
		ph.dial();
		ph.sendSms();
		
		CameraPhone cp=new CameraPhone();
		cp.dial();
		cp.sendSms();
		cp.capturedPhoto();

	}

}
