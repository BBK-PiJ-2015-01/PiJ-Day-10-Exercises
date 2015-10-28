public class Guitar implements Wooden, Instrument {

	/**
	*	Some Guitar notes
	*/
	@Override
	public void play(){
			
		System.out.println(getClass().getSimpleName() +": Play some notes");
	}
	/**
	*	Jimi's guitar
	*/
	@Override
	public void burn(){
	
		System.out.println(getClass().getSimpleName() +": Jimi's guitar's on fire'");
	}
}