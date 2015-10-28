/**
* Old style phone I presume
*/
public class OldPhone implements Phone {

	private String brand = null;
	
	public OldPhone() {
		
	}
	public OldPhone(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	/**
	* Call the supplied number
	*/
	@Override
	public void call(String number) {
		
		System.out.println(getClass().getSimpleName() +": Calling - " + number);
	}
}