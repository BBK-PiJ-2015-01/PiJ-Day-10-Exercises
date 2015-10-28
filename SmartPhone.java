/**
* Modern mobile phone I presume
*/
public class SmartPhone extends MobilePhone {

	//
	private final String INTERNET_CALL_PREFIX = "00";
	
	public SmartPhone() {
		super();
	}
	public SmartPhone(String brand) {
		super(brand);
	}
	/**
	* Allows international numbers to be switched to internet calling
	*/
	@Override
	public void call(String number) {
		
		if (number != null && !number.isEmpty() && number.startsWith(INTERNET_CALL_PREFIX)) {
			System.out.println(getClass().getSimpleName() + ": Calling " + number + " through the internet to save money");
			storeNumber(number);
		} else {
			super.call(number);
		}
	}
	/**
	* Open browser on supplied URI
	*/
	public void browseWeb(String uri) {

		System.out.println(getClass().getSimpleName() +": Navigate to - " + uri);
	}
	/**
	* Return an Object indicating current position
	*/
	public Object findPosition() {
		
		return "Find position";	
	}
}