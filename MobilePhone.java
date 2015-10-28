/**
* Old style mobile phone I presume
*/
public class MobilePhone extends OldPhone {

	private String[] lastNumbers = new String[10];

	public MobilePhone() {
		super();
	}
	public MobilePhone(String brand) {
		super(brand);
	}
	/** 
	*	Rings the Alarm tone
	*/
	public void ringAlarm(String alarm) {
		
		System.out.println(getClass().getSimpleName() +": Ring alarm - " + alarm);
	}
	/** 
	*	Plays a game
	*/
	void playGame(String game) {
		
		System.out.println(getClass().getSimpleName() +": Play game - " + game);
	}
	/** 
	*	Print the call log
	*/
	public void printLastNumbers() {
	
		System.out.println(getClass().getSimpleName() +": Last numbers... " );
		for (String lastNumber : lastNumbers) {
			if (lastNumber != null) {
				System.out.println("\t" + lastNumber);
			}
		}
	}
	/**
	* Override call to store numbers
	*/
	@Override
	public void call(String number) {
		
		storeNumber(number);
		super.call(number);
	}
	/**
	* Stores the number at the end of the log
	*/
	void storeNumber(String number) {
		
		System.arraycopy(lastNumbers, 1, lastNumbers, 0, lastNumbers.length -1 );	
		lastNumbers[lastNumbers.length -1] = number;
	}
}