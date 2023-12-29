import java.util.ArrayList;

/** Collection class to hold list of tenants
 * @author Kaycee Ezenta
 *@version 25th November 2023
 */
public class TenantList {
	// attributes 
	private ArrayList<Tenant>tList;
	public  final int MAX;
	
	/** Constructor that initialises the empty tenant list and sets the maximum list size
	 * @param maxIN: The maximum number of tenants in the list
	 */
	public TenantList(int maxIn) {
		tList = new ArrayList<>();
		MAX = maxIn;
	}
	
	/** Checks if the tenant list is full
	 * @return Returns true if the list is full and false otherwise
	 */
	public boolean isFull() {
		return tList.size() == MAX;
	}
	
	/** Check if the list is empty or not
	 * @return true if list is empty or false otherwise
	 */
	public boolean isEmpty() {
		return tList.isEmpty();
	}
	
	/** Gets the total number of tenants
	 * @return Returns the total number of tenants in the list
	 */
	public int getTotal() {
		return tList.size();
	}
	
	/** Adds a new tenant to the list
	 * @param tIn: The tenant to add
	 * @return Returns true if tenant was added successfully and false otherwise
	 */
	public boolean addTenant(Tenant tIn) {
		if(!isFull())
		{
			tList.add(tIn);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/** Searches for a tenant in a given room
	 * @param roomIn: The room number to search for
	 * @return Returns the tenant in the given room or null if no tenant in the given room
	 */
	public Tenant search(int roomIn) {
		for(Tenant currentTenant: tList)
		{
			if(currentTenant.getRoom() == roomIn)
			{
				return currentTenant;
			}
		}
		return null;
	}
	
	/** Reads the tenant in the given position in the list 
	 * @param positionIn: The logical position of the tenant in the list
	 * @return Returns the tenant at the given logical position in the list or null if no tenant at the given logical position
	 */
	public Tenant getTenant(int positionIn) {
		if(positionIn < 1 || positionIn > getTotal())
		{
			return null;
		}
		else
		{
			return tList.get(positionIn - 1);
		}
	}
	
	/** Removes a tenant in the list
	 * @param roomIn: The room number of the tenant to be removed
	 * @return Returns true if tenant is removed successfully and false if no tenant in the given room number
	 */
	public boolean removeTenant(int roomIn) {
		Tenant t = search(roomIn);
		if(t != null)
		{
			tList.remove(t);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return tList.toString();
	}

}