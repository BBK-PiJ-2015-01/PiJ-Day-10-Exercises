/** 
*		
*/
public class Teacher {

	private final String name;
	
	public Teacher(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	/**
	*	Performs teaching duties
	*/
	public void teach(String lessonName) {
		System.out.println("Teaching lesson: " + lessonName);
	}
}