package ai.jobiak.jdbcmvc;

public class User {
   int id;
   String title;
   double balance;
   public User() {
	// TODO Auto-generated constructor stub
    }
public User(int id, String title, double balance) {

	this.id = id;
	this.title = title;
	this.balance = balance;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
   
    
}
