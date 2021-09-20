package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		
		james.takeBus(bus100);
		tomas.takeSubway(subwayGreen);
		
		james.showInfo();
		bus100.showInfo();
		
		tomas.showInfo();
		subwayGreen.showInfo();
	}

}
 