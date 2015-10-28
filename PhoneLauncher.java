public class PhoneLauncher {

	public static void main(String[] args) {
	
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		
	// your code creating and using SmartPhone here...
		smartPhoneAsPhone();	
		smartPhoneAsOldPhone();	
		smartPhoneAsMobilePhone();
		smartPhoneAsSmartPhone();
		smartPhoneInternetCall();
		smartPhoneTestCalls();
		smartPhoneContructors();
		restrictedSmartPhone();
	}
	

	private void smartPhoneAsPhone() {
		
		Phone phone = new SmartPhone();
		phone.call("ME!");
	}
	
	private void smartPhoneAsOldPhone() {
		
		OldPhone oldPhone = new SmartPhone();
		oldPhone.call("YOU!");		
	}

	private void smartPhoneAsMobilePhone() {
		
		MobilePhone mobilePhone = new SmartPhone();
		mobilePhone.call("HIM!");	
		mobilePhone.playGame("Snake");	
		mobilePhone.printLastNumbers();				
	}	
	
	private void smartPhoneAsSmartPhone() {
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call("HER!");	
		smartPhone.browseWeb("moodle.bbk.ac.uk");	
		System.out.println("Find position: " + smartPhone.findPosition());			
	}	
	
	private void smartPhoneInternetCall() {

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call("00 123 4567 8910");	
		smartPhone.call("00 123 4567 8911");	
		smartPhone.call("00 123 4567 8912");	
		smartPhone.call("00 123 4567 8913");	
		smartPhone.call("00 123 4567 8914");	
		smartPhone.call("00 123 4567 8915");	
		smartPhone.call("00 123 4567 8916");	
		smartPhone.call("00 123 4567 8917");	
		smartPhone.call("00 123 4567 8918");	
		smartPhone.call("00 123 4567 8919");	
		smartPhone.call("00 123 4567 8920");	
		smartPhone.call("00 123 4567 8921");	
		smartPhone.call("00 123 4567 8922");	
		smartPhone.call("00 123 4567 8923");	
		smartPhone.printLastNumbers();
	}	
	
	private void smartPhoneTestCalls() {

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call("01282 8479003");	
		smartPhone.printLastNumbers();			
	}	
	
	private void smartPhoneContructors() {

		SmartPhone smartPhone = new SmartPhone("Samsung");
		System.out.println("The Smart Phone is a '" + smartPhone.getBrand() + "'");		
	}	
	
	private void restrictedSmartPhone() {

		new RestrictedSmartPhone("Moto G").playGame("Space Invaders");
	}
}