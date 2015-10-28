public class WoodenObject implements Wooden {

	/**
	* Not the Deep Purple album
	*/
	@Override
	public void burn(){
	
		System.out.println(getClass().getSimpleName() +": Smokin'");
	}
}