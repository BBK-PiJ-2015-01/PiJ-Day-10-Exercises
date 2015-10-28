public class GuitarLauncher {

	public static void main(String[] args) {
	
//		new GuitarLauncher().runGuitar();
		new GuitarLauncher().runWoodenGuitar();
	}
	
	private void runGuitar() {
	
		Instrument guitarAsInstrument = new Guitar();
		guitarAsInstrument.play();
		
		Wooden guitarAsWooden = new Guitar();
		guitarAsWooden.burn();
		
		Guitar guitarAsGuitar = new Guitar();
		guitarAsGuitar.play();
		guitarAsGuitar.burn();
	}
	
	private void runWoodenGuitar() {
		
		Instrument guitarAsInstrument = new WoodenGuitar();
		guitarAsInstrument.play();
		
		Wooden guitarAsWooden = new WoodenGuitar();
		guitarAsWooden.burn();
		
		WoodenGuitar guitarAsGuitar = new WoodenGuitar();
		guitarAsGuitar.play();
		guitarAsGuitar.burn();
		
	}
}