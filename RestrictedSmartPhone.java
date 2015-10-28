public class RestrictedSmartPhone extends SmartPhone {

	public RestrictedSmartPhone() {
		super();
	}
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}
	/** 
	*	Prevents anyone from playing games on this device
	*/
	@Override
	void playGame(String game) {
		
		System.out.println(getClass().getSimpleName() +": Playing games is Verboten!");
	}

}