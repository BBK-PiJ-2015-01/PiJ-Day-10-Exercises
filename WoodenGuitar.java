public class WoodenGuitar extends MusicalInstrument implements Wooden {

	private final WoodenObject woodenImplementation = new WoodenObject() {
	
		/**
		* Implement the burning wooden guitar
		*/
		@Override
		public void burn(){
			
			super.burn();
			System.out.println(getClass().getSimpleName() +": Guitar is now burning'");
		}
	};

	/**
	*	Wooden interface implementation
	*/
	@Override
	public void burn(){
	
		woodenImplementation.burn();
	}
}