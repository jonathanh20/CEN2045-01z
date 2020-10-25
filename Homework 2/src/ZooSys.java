import java.util.Scanner;

class zooPatron {
	int customerID;
	String name;
	String email;
	String phone;
	String address;
	int ticketNum;
	
	public zooPatron (int id, String n, String e, String ph, String addr, int ticket) {
		
		customerID = id;
		name = n;
		email = e;
		phone = ph;
		address = addr;
		ticketNum = ticket;
	}
	
	

}






class zooCoordinator {
	int employeeID;

	static void reportKeeper() {
		
		
	}// end report keeper
	
	static void reportVet() {
		
		
	}// end report vet

}//end zooCoordinator






class zooEvent {
	
	String eventName;
	String eventTime;
	String eventDate;
	String eventLoc;
	boolean isRepeating;
	int assignedKeeper;
	
	public zooEvent(String name, String time, String date, String loc, boolean repeats, int keeper) {
		
		eventName = name;
		eventTime = time;
		eventDate = date;
		eventLoc = loc;
		isRepeating = repeats;
		assignedKeeper = keeper;
		
	}
	
	public zooEvent() {
		
		eventName = "Avian Aviators";
		eventTime = "12pm and 4pm";
		eventDate = "Mondays and Wednesdays";
		eventLoc = "The Aviary";
		isRepeating = true;
		assignedKeeper = 01;
	}

	static void update(String name, String time, String date, String loc, boolean repeats, int keeper) {

		
	}//end update
	
	static void createEvent(zooEvent e) {
		
		String userString;
		int userInt;
		boolean userBoolean;
		  Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the event name: ");
		userString = scanner.nextLine();
		
		e.eventName = userString;
		
		System.out.println("Please enter the event time: ");
		userString = scanner.nextLine();
		
		e.eventTime = userString;
		
		System.out.println("Please enter the event date: ");
		userString = scanner.nextLine();
		
		e.eventDate = userString;
		
		System.out.println("Please enter the event location: ");
		userString = scanner.nextLine();
		
		e.eventLoc = userString;
		
		System.out.println("Please type 'true' if the event is recurring: ");
		userBoolean = scanner.nextLine() != null;
		
		e.isRepeating = userBoolean;
		
		System.out.println("Please enter the assigned zoo keeper employee ID: ");
		userInt = scanner.nextInt();
		
		e.assignedKeeper = userInt;
		
		scanner.close();
		
		System.out.print("The assigned zoo keeper with the ID: " + e.assignedKeeper + " has been notified");
		
	}//end createEvent

}// end zooEvent






class zooEnclosure {
	int locID;
	String cleaningSchedule;
	boolean isClean;
	int assignedKeeper;
	boolean isUnassigned;
	
	
	public zooEnclosure (int ID, String schedule, boolean clean, int keeper, boolean assign) {
		
		locID = ID;
		cleaningSchedule = schedule;
		isClean = clean;
		assignedKeeper = keeper;
		isUnassigned = assign;
	}// end constructor
	
	public zooEnclosure () {
		
		locID = 03;
		cleaningSchedule = "Monday/Thursday";
		isClean = false;
		assignedKeeper = 1;
		isUnassigned = false;
	}// end constructor
	
	static void update() {
		
		
	}//end update
	
	static void report(zooEnclosure e) {
		
		System.out.println(e.locID);
		System.out.println(e.cleaningSchedule);
		System.out.println(e.isClean);
		System.out.println(e.assignedKeeper);
		System.out.println(e.isUnassigned);
	}//end report
	
	
	static void queryEnclosure(zooAnimal z, zooEnclosure e) {
		
		int animalLoc;
		int enclosure;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the new enclosure ID: ");
		enclosure = scanner.nextInt();
		
		System.out.println("Animal with ID: " + z.id + " has been reassigned to enclosure " + enclosure);
		
		e.locID = enclosure;
		
		if (e.isClean == false) {
			
			System.out.print("Enclosure ID: " + e.locID + " requires cleaning. Zookeeper notified");
			
			scanner.close();
		}
	}//end queryEnclosure

}//end zooEnclosure





class zooVet {
	int employeeID;
	String name;
	String email;
	String phone;
	String assignedAnimals;
	
	public zooVet(int id, String n, String e, String ph, String animals) {
		
		employeeID = id;
		name = n;
		email = e;
		phone = ph;
		assignedAnimals = animals;
	}//end vet constructor
	
	
	public zooVet() {
		
		employeeID = 2;
		name = "Dr. Jane Goodall";
		email = "jg@zoo.com";
		phone = "(321)654-0987";
		assignedAnimals = "01, 04";
	}//end vet constructor
	
	
	static void updateInfo() {
		
	}//end updateInfo
	
	static void report(zooVet vet) {
		
		System.out.println(vet.employeeID);
		System.out.println(vet.name);
		System.out.println(vet.email);
		System.out.println(vet.phone);
		System.out.println(vet.assignedAnimals);
		
	}// end report
	
	static void assignAnimal() {
		
		
	}// end assignAnimal

}//end zooVet






class zooKeeper {
	
	int employeeID;
	String name;
	String email;
	String phone;
	String assignedShows;
	String assignedAnimals;
	int assignedEnclosure;
	
	public zooKeeper (int id, String n, String e, String ph, String shows, String animals, int enclosure) {
		
		employeeID = id;
		name = n;
		email = e;
		phone = ph;
		assignedShows = shows;
		assignedAnimals = animals;
		assignedEnclosure = enclosure;
	}// end keeper constructor
	
	public zooKeeper() {
		
		employeeID = 1;
		name = "John Doe";
		email = "jd@zoo.com";
		phone = "(701)123-4567";
		assignedShows = "Bird Calls 101";
		assignedAnimals = "01, 03";
		assignedEnclosure = 10;
		
	}//end default constructor
	
	static void report(zooKeeper keeper) {
		
		System.out.println(keeper.employeeID);
		System.out.println(keeper.name);
		System.out.println(keeper.email);
		System.out.println(keeper.phone);
		System.out.println(keeper.assignedShows);
		System.out.println(keeper.assignedEnclosure);
	}
	
	
	static void updateShows() {
		
		
	}//end updateShows
	
	
	static void updateInfo() {
		
		
	}//end updateInfo
	
	
	static void assignAnimal() {
		
		
	}//end assignAnimal

}//end zooKeeper


class zooAnimal {
	//attributes
	int id;
	String sex;
	String dateOfBirth;
	String animalType;
	String feedSchedule;
	String medicationSchedule;
	int assignedKeeper;
	int assignedVet;
	int animalLoc;
	
	//constructor
	public zooAnimal(int ID, String animalSex, String dob, String type, String feed, String meds, int keeper, int vet, int loc) {
	
		id = ID;
		sex = animalSex;
		dateOfBirth = dob;
		animalType = type;
		feedSchedule = feed;
		medicationSchedule = meds;
		assignedKeeper = keeper;
		assignedVet = vet;
		animalLoc = loc;
	
	}// end zooAnimal constructor
	
	public zooAnimal() {
		
		id = 02;
		sex = "Male";
		dateOfBirth = "04 March 2019";
		animalType = "Polar bear";
		feedSchedule = "6am and 6pm";
		medicationSchedule = "Twice daily";
		assignedKeeper = 1;
		assignedVet = 2;
		animalLoc = 03;
	
	}// end zooAnimal constructor
	
	
	//methods
	  static void registerAnimal(zooAnimal z) {
		  Scanner scanner = new Scanner(System.in);
		  
		    System.out.println("Enter animal ID");
			int id = scanner.nextInt();
		   
			System.out.println("Enter animal sex \n");
			String sex = scanner.nextLine() + scanner.nextLine();
		   
			System.out.println("Enter animal date of birth \n");
			String dateOfBirth = scanner.nextLine();
		   
			System.out.println("Enter animal type \n");
			String animalType = scanner.nextLine();
		   
			
			System.out.println("Enter animal feed schedule \n");
			String feedSchedule = scanner.nextLine();
		   
			System.out.println("Enter animal medication schedule \n");
			String medicationSchedule = scanner.nextLine();
		   
			System.out.println("Enter animal assigned keeper ID \n");
			int assignedKeeper = scanner.nextInt();
		   
			System.out.println("Enter animal assigned veterinarian ID \n");
			int assignedVet = scanner.nextInt();
		   
			System.out.println("Enter animal enclosure ID \n");
			int animalLoc = scanner.nextInt();
			
			  
			  z.id = id;
			  z.sex = sex;
			  z.dateOfBirth = dateOfBirth;
			  z.animalType = animalType;
			  z.feedSchedule = feedSchedule;
			  z.medicationSchedule = medicationSchedule;
			  z.assignedKeeper = assignedKeeper;
			  z.assignedVet = assignedVet;
			  z.animalLoc = animalLoc;
			  
			  System.out.println("**NEW ANIMAL REGISTERED**");
			  System.out.println("ID: " + z.id);
			  System.out.println("Sex: " + z.sex);
			  System.out.println("DOB: " + z.dateOfBirth);
			  System.out.println("Type: " + z.animalType);
			  System.out.println("Feeding Schedule: " + z.feedSchedule);
			  System.out.println("Medication Schedule: " + z.medicationSchedule);
			  System.out.println("Assigned Keeper ID: " + z.assignedKeeper);
			  System.out.println("Assigned Veterinarian ID" + z.assignedVet);
			  System.out.println("Assigned Location ID: " + z.animalLoc);
		  

	  }//registerAnimal
	  
	  static void deregisterAnimal(zooAnimal z) {
		  
		  int id = z.id;
		  z.id = 0;
		  z.sex = "";
		  z.dateOfBirth = "";
		  z.animalType = "";
		  z.feedSchedule = "";
		  z.medicationSchedule = "";
		  z.assignedKeeper = 0;
		  z.assignedVet = 0;
		  z.animalLoc = 0;
		  System.out.println("Animal with ID " + id + " has been deregistered.");
		  System.out.println("The assigned zoo keeper and veterinarian have been notified");
		  
	  }//end deregisterAnimal
	  
	  static void report(zooAnimal z) {
		  System.out.println(z.id);
		  System.out.println(z.sex);
		  System.out.println(z.dateOfBirth);
		  System.out.println(z.animalType);
		  System.out.println(z.feedSchedule);
		  System.out.println(z.medicationSchedule);
		  System.out.println(z.assignedKeeper);
		  System.out.println(z.assignedVet);
		  System.out.println(z.animalLoc);

	  }//registerAnimal
	  
	  static void updateMeds(zooAnimal z,String meds) {
		  
		  String medication = meds;
		  z.medicationSchedule = medication;
		  System.out.println("Animal ID: " + z.id);
		  System.out.println("Medication schedule updated to: " + z.medicationSchedule);
		  System.out.println("Zoo Coordinator notified of update");
	  }
	
}// end zooAnimal



public class ZooSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userOption;
		String userString;
		 
		  Scanner scanner = new Scanner(System.in);
		  
		  
		  zooKeeper keeper = new zooKeeper();
		  zooVet vet = new zooVet();
		  zooAnimal animal = new zooAnimal();
		  zooEnclosure enclosure = new zooEnclosure();
		  zooEvent event = new zooEvent();
		  
		  System.out.println("Press 1 to register a new animal");
		  System.out.println("Press 2 to update the animal's medication schedule");
		  System.out.println("Press 3 to assign a new enclosure for the animal");
		  System.out.println("Press 4 to create a new zoo event");
		  System.out.println("Press 5 to deregister an animal");
		  userOption = scanner.nextInt();
		  

			

		  if (userOption == 1){
				 
				 zooAnimal.registerAnimal(animal);
				 zooAnimal.report(animal);
			 }
		  
		  
			 else if (userOption == 2) {
				 
				 System.out.println("Please enter the new medication schedule: ");
				
				 userString = scanner.nextLine()+ scanner.nextLine();
				
				 zooAnimal.updateMeds(animal, userString);
				
			 }	//end if
		  
		  
		  
			 else if (userOption == 3) {

				 zooEnclosure.queryEnclosure(animal, enclosure);
			 }	//end if
		  
		  
		  
			 else if (userOption == 4) {

				 zooEvent.createEvent(event);
			 }	//end if
		  
		  
		  
			 else if (userOption == 5) {

				 zooAnimal.deregisterAnimal(animal);
			 }	//end if
		  


}
}
