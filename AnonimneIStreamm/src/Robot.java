
public class Robot {
	
	public void sayGoodMorning (String name) {
		
		
		Greeting greeting = new Greeting() {
			
			@Override
			public void sayGoodMorning(String name) {
				System.out.println("Good morning " + name+ "!");
				
			}
		};
		greeting.sayGoodMorning(name);
	}

}
