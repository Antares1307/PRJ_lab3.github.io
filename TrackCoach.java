package lab3_1;

public class TrackCoach implements Coach {
	
	private final HappyFortuneService happyFortuneService;
	
	
	public TrackCoach(HappyFortuneService happyFortuneService) {
		super();
		this.happyFortuneService = happyFortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}


	public HappyFortuneService getHappyFortuneService() {
		return happyFortuneService;
	}
	
}
