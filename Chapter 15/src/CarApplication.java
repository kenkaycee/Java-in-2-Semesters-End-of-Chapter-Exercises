public class CarApplication{
    public static void main (String[] args) {
        CarRegister myCar = null;
        int choice;
    	try
    	{    		
    		System.out.print("What is the maximum capacity of the park?: ");
    		int size = EasyScanner.nextInt();
    	    myCar = new CarRegister(size);
    	}
    	catch(CarRegisterException e) // catch exception from CarRegister constructor
    	{
    		System.out.println(e); // display exception object
    	}
    	catch(Exception e) // general catch clause 
    	{
    		System.out.println("unforeseen error");
    		e.printStackTrace();
    	}
       if(myCar != null)
       {
    	   do 
           {
               System.out.println();
               System.out.println("1. Give permit");
               System.out.println("2. Record Parking");
               System.out.println("3. Record Exit");
               System.out.println("4. Check if car has a permit");
               System.out.println("5. Check if car is parked in the car park");
               System.out.println("6. Check if car park is full");
               System.out.println("7. Number of cars allocated permit");
               System.out.println("8. Number of cars currently in the car park");
               System.out.println("9. Display cars that have a permit");
               System.out.println("10. Display cars currently parked in the car park");
               System.out.println("11. Maximum capacity of the car park");
               System.out.println("12. Numbers of free parking space");
               System.out.println("13. Quit the program");
               System.out.println();
               System.out.print("Enter choice [1-13]: ");
               choice = EasyScanner.nextInt();
               System.out.println();
               switch(choice)
               {
                   case 1: option1(myCar); break;
                   case 2: option2(myCar);break;
                   case 3: option3(myCar);break;
                   case 4: option4(myCar);break;
                   case 5: option5(myCar);break;
                   case 6: option6(myCar);break;
                   case 7: option7(myCar);break;
                   case 8: option8(myCar);break;
                   case 9: option9(myCar);break;
                   case 10: option10(myCar); break;
                   case 11: option11(myCar);break;
                   case 12: option12(myCar);break;
                   case 13: break;
                   default: System.out.println("Invalid entry. Enter 1 - 13 only!!!");
               }
           }while(choice != 13);
       }
       
    }
    
    // give permit 
    static void option1(CarRegister carIn){
        System.out.print("Enter Reg Number: ");
        String regNum = EasyScanner.nextString();
        boolean ok = carIn.givePermit(regNum);
        if(ok)
        {
            System.out.println("Parking Permit Granted");
        }
        else 
        {
           System.out.println("Car already has a permit"); 
        }
    }
    
    // record parking 
    static void option2(CarRegister carIn){
        System.out.print("Enter Reg Number: ");
        String regNum = EasyScanner.nextString();
        int ok = carIn.recordParking(regNum);
        if(ok == 1)
        {
            System.out.println("Car entering the Park");
        }
        else if(ok == -1)
        {
            System.out.println("Park is full");
        }
        else if(ok == -2)
        {
            System.out.println("Car does not have a permit");
        }
    }
    
    // record exit 
    static void option3(CarRegister carIn){
        System.out.println("Enter Reg number: ");
        String regNum = EasyScanner.nextString();
        boolean ok = carIn.recordExit(regNum);
        if(ok)
        {
            System.out.println("Car leaving the park");
        }
        else 
        {
            System.out.println("Car was not parked in the Park");
        }
    }
    // has permit
    static void option4(CarRegister carIn){
        System.out.println("Enter Reg number: ");
        String regNum = EasyScanner.nextString();
        boolean permit = carIn.hasPermit(regNum);
        if(permit)
        {
            System.out.println("Car has a permit");
        }
        else 
        {
            System.out.println("Car does NOT have a permit");
        }
    }
    
    // is parked 
    static void option5(CarRegister carIn){
        System.out.println("Enter Reg number: ");
        String regNum = EasyScanner.nextString();
        boolean parked = carIn.isParked(regNum);
        if(parked)
        {
            System.out.println("Car is parked in the car park");
        }
        else 
        {
            System.out.println("Car is NOT parked in the car park");
        }
    }
    
    // is full 
    static void option6(CarRegister carIn){
        if(carIn.isFull())
        {
            System.out.println("Car park is full");
        }
        else 
        {
            System.out.println("Car park is NOT full");
        }
    }
    
    // total number of cars allocated permit
    static void option7(CarRegister carIn){
        System.out.println("Total number of cars allocated permit: " + carIn.numberPermit());
    }
    // total number of cars in the park
    static void option8(CarRegister carIn){
        System.out.println("Total number of cars in the park: " + carIn.numberParked());
    }
    
    // Display cars that have permit
    static void option9(CarRegister carIn){
        System.out.println(carIn.getPermit());
    }
    
    // Display Cars that are parked
    static void option10(CarRegister carIn){
        System.out.println(carIn.getParked());
    }
    
    // capacity of the car park
    static void option11(CarRegister carIn){
        System.out.println("Capacity of the car park: " + carIn.getCapacity());
    }
    
    // number of free parking spaces 
    static void option12(CarRegister carIn){
        if(carIn.numberOfFreeParkingSpace() == 1)
        {
            System.out.println("Free parking space: " + carIn.numberOfFreeParkingSpace());
        }
        else 
        {
            System.out.println("Free parking spaces: " + carIn.numberOfFreeParkingSpace());
        }
    }
}

