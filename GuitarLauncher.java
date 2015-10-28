public class GuitarLauncher {

	public static void main(String[] args) {
	
		new GuitarLauncher().runGuitar();
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
}