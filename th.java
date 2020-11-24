package SelfLearning;
import java.io.IOException;

public class th {
	
	void m() throws IOException{
		throw new IOException("device error"); }
	
	void n() throws IOException{
		m(); }
	
	void p() {
		try {
			n();
		} catch(Exception e) {
		System.out.println("Exception Corrected");
		}
	
}
	
	public static void main(String[] args) {
		
		th obj = new th();
		obj.p();
		System.out.println("Done");
		
	}
}







