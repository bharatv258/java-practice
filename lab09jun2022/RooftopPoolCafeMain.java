package lab0906;

public class RooftopPoolCafeMain {
	
	
	private static void callCafe() {
		
		RooftopPoolCafe r1 = new RooftopPoolCafeFactory().getRooftopPoolCafe();
		
		// getting rooftoppoolcafe object
		
		if (r1 !=null)
		{
			r1.welcomeDrink();
			r1.ambiance();
			r1.chilling();
			r1.prepareChowmin();
			r1.prepareKebab();
			
			if (r1 instanceof CafeBharat)		// downcasting or checking the type
			{
				((CafeBharat) r1).bharatCafeOffer();
			}
			
			else if (r1 instanceof CafeNisha)	// downcasting or checking the type
			{
				((CafeNisha) r1).nishaCafeOffer();;
			}
			
			
		}
		
		
		else {
			System.out.println("Try between Bharat Cafe or Nisha Cafe");
			}
	}

	public static void main(String[] args) {
		
		callCafe();					// refactor custom method to minimize main()

	}

	
	

}
