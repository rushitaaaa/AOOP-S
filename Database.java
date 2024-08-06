package qwerty;

public class Database {
	private static Database dbObject; 
	
	private Database() {}
	
	public static Database getInstance() {
		if(dbObject==null) {
			dbObject=new Database();// object created
		}
		System.out.println("Instance created");
	return dbObject;
	}
	
	public void getconnection() {
		System.out.println("connected");
	}
	
	public static void main(String args[]) {
		Database ob;
		ob=Database.getInstance();
		ob.getconnection();
		
	}
}
