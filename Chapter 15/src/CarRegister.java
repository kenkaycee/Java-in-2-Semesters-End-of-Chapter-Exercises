/*
 Consider an application that keeps track of the registration numbers of all cars
that have a permit to use a company car park. It also keeps track of the registration numbers of the cars actually in the car park at any one time. While there
is no limit to the number of cars that can have permits to park in the car park, the
capacity of the car park is limited. Below we give the UML design for the
CarRegister class:*/

/**
 * Collection Class used to hold a list of registration number of cars granted permit and parked in a car park
 * @author Kaycee Ezenta
 * @version 26th September 2023
 */
import java.util.HashSet;
import java.util.Set;
public class CarRegister
{
    // attributes 
    private Set<String> permit; 
    private Set<String> parked;
    private int capacity;
    
    /** Constructor initialises the empty permit and parked Set and sets the maximum capacity size of the park
     * @param capacityIn: The maximum capacity of the park
     */
    public CarRegister(int capacityIn){
        permit = new HashSet<>();
        parked = new HashSet<>();
        if(capacityIn < 1)
        {
        	throw new CarRegisterException("Invalid Car Park Size: " + capacityIn);
        }
        else
        {
            capacity = capacityIn;
        }
    }
    
    /** Records the registration number of a car given a permit to park
     * @param regNum: The registration number of the car
     * @return Returns false if the car has already a permit and true otherwise
     */
    public boolean givePermit(String regNum){
    	regNum = regNum.toUpperCase();
        if(permit.contains(regNum))
        {
            return false;
        }
        else 
        {
            permit.add(regNum);
            return true;
        }
    }
    
    /** Records the registration number of a car entering the car park
     * @param regNum: The registration number of the car
     * @return Returns -1 if the car park is full and -2 if the car does not have a parking permit and 1 if car has a permit and car park is not full
     */
    public int recordParking(String regNum){
    	regNum = regNum.toUpperCase();
        if(parked.size() == capacity)
        {
            return -1;
        }
        else if(!permit.contains(regNum))
        {
            return -2;
        }
        else
        {
            parked.add(regNum);
            return 1;
        }
    }
    
    /** Records the registration of a car leaving the car park
     * @param regNum: The registration number of the car
     * @return Returns true if the car with the given registration number was recorded  as being parked in the car park and false otherwise
     */
    public boolean recordExit(String regNum){
    	regNum = regNum.toUpperCase();
        if(parked.contains(regNum))
        {
            parked.remove(regNum);
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    /** Checks if a car with given reg number has a parking permit
     * @param regNum: The registration number of the car
     * @return Returns true if the car has a permit and false otherwise
     */
    public boolean hasPermit(String regNum){
    	regNum = regNum.toUpperCase();
        if(permit.contains(regNum))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    /** Checks if a car with given reg number is parked in the car park
     * @param regNum: The registration number of the car
     * @return Returns true if the car is recorded as being parked in the car park and false otherwise
     */
    public boolean isParked(String regNum){
    	regNum = regNum.toUpperCase();
        if(parked.contains(regNum))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    /**Check if the car park is full
     * @return Returns true if the car park is full and false otherwise
     */
    public boolean isFull(){
        return parked.size() == capacity;
    }
    
    /** Gets the total number of cars parked in the car park
     * @return returns the total number of cars currently parked in the car park
     */
    public int numberParked(){
        return parked.size();
    }
    
    /** Gets the total number of cars granted car parking permit
     * @return returns the total number of cars currently parked in the car park
     */
    public int numberPermit(){
        return permit.size();
    }
    
    /** Reads the cars that have a permit
     * @return Returns the set of car registrations allocated permits
     */
    public Set<String> getPermit(){
        Set<String> regNums = new HashSet<>();
        for(String item: permit)
        {
            regNums.add(item);
        }
        return regNums;
    }
    
    /** Reads the cars parked in the car park
     * @return Returns the set of registration numbers of cars in the car park
     */
    public Set<String> getParked(){
        Set<String> regNums = new HashSet<>();
        for(String item: parked)
        {
            regNums.add(item);
        }
        return regNums;
    }
    
    /** Gets the maximum capacity of the car park
     * @return Returns the maximum capacity of the car park
     */
    public int getCapacity(){
        return capacity;
    }
	
    /** Gets the number of free spaces in the car park
     * @return Returns the number of free parking spaces in the car park
     */
	public int numberOfFreeParkingSpace(){
	    return capacity - numberParked();
	}
	
}