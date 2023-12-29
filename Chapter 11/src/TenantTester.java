
public class TenantTester {

	public static void main(String[] args) {
		Tenant t = new Tenant("Kaycee Ezenta", 10);
		Payment p = new Payment("Feb", 1330);
		t.makePayment(p);
		System.out.println(t);
	}

}