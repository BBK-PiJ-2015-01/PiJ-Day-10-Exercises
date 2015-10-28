public class Exercise6 {

	public static void main(String[] args) {
	
		new Exercise6().exercise6Runner();
	
	}
	
	private void exercise6Runner() {
	
		Lecturer lecturer = new Lecturer("Sheldon");
		
		lecturer.teach("Nonsense");
		lecturer.doResearch("Silly string");
	}
}