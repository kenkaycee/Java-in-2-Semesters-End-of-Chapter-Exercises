/**
 * (b) Now a TimeTable class is defined to process these bookings. Its UML
diagram is given below:
TimeTable
-times: Booking[][]
+TimeTable(int, int)
+makeBooking(int, int, Booking) : boolean
+cancelBooking(int, int) : boolean
+isFree(int, int) : boolean
+getBooking(int, int) : Booking
+numberOfDays() : int
+numberOfPeriods() : int
 */

public class TimeTable {
    // attributes 
    private Booking[][] times; // two dim array of Booking objects
    
    // constructor: A constructor that accepts the number of days per week and number of periods per day and sizes the timetable accordingly.
    public TimeTable(int dayIn, int periodIn){
        times = new Booking[dayIn][periodIn];
    }
    /*+makeBooking(int, int, Booking) : boolean Accepts the booking details for a particular day and period and, as long as this slot is not 
    previously booked and the day and period numbers are valid, updates the timetable accordingly. Returns true if the booking was recorded successfully and false if not. */

    // methods 
    public boolean makeBooking(int dayIn, int periodIn, Booking bookingIn){
    	
        for(int day = 1; day <= times.length; day++)
        {
            for(int period = 1; period <= times[0].length; period++)
            {
                if(times[dayIn-1][periodIn-1] == null)
                {
                    times[dayIn-1][periodIn-1] = bookingIn;
                    return true;
                }
            }
        }
        return false;
    }
    
    /*+cancelBooking(int, int) : boolean
Cancels the booking details for a particular day and period. Returns false if the given slot was not previously booked or the day and period number
are invalid, and true if the slot was cancelled successfully.*/
    public boolean cancelBooking(int dayIn, int periodIn) {
    	for(int day = 1; day <= times.length; day++)
    	{
    		for(int period = 1; period <= times[0].length; period++)
    		{
    			if(times[dayIn-1][periodIn-1] != null && ((dayIn >= 1 && dayIn <= times.length) && (periodIn >= 1 && periodIn <= times[1].length)))
    			{
    				times[dayIn-1][periodIn-1] = null;  
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    /*+isFree(int, int) : boolean
Accepts a day and period number and returns true if the day and period numbers are valid and the given slot is free, and false otherwise.*/
    public boolean isFree(int dayIn, int periodIn) {
    	for(int day = 1; day <= times.length; day++)
    	{
    		for(int period = 1; period <= times[0].length; period++)
    		{
    			if(times[dayIn-1][periodIn-1] == null && (dayIn >= 1 && dayIn <= times.length) && (periodIn >= 1 && periodIn <= times[0].length))
    			{
    				return true;    				
    			}
    		}
    	}
    	return false;
    }
    
    /*+getBooking(int, int) : Booking
Accepts a day and period number and returns the booking for the given slot if the day and period number are valid and the slot has been booked or
null otherwise*/
    
    
    /*+numberOfDays() : int Returns the number of days associated with this timetable.*/
    public int numberOfDays() {
    	return times.length;
    }
    
    /*+numberOfPeriods() : int 
	Returns the number of periods associated with this timetable.*/
    public int numberOfPeriods() {
    	return times[0].length;
    }
    
    /*+getBooking(int, int) : Booking
Accepts a day and period number and returns the booking for the given slot
if the day and period number are valid and the slot has been booked or
null otherwise.*/ 
    public Booking getBooking(int dayIn, int periodIn) {
    	for(int day = 1; day <= times.length; day++)
    	{
    		for(int period = 1; period <= times[0].length; period++)
    		{
    			if(times[dayIn-1][periodIn-1] != null && (dayIn >= 1 && dayIn <= times.length) && (periodIn >= 1 && periodIn <= times[0].length))
    			{
    				Booking book = times[dayIn-1][periodIn-1];
    				return book;
    				
    			}
    		}
    	}
    	return null;
    }
}













