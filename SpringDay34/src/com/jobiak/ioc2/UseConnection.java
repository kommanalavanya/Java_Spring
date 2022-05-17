package com.jobiak.ioc2;
import com.jobiak.ioc.*;
public class UseConnection {
public UseConnection() {
	NewConnection con=new NewConnection();//spring says new is a nuisance
	con.getConnection();
	System.out.println("connection obtained in "+this.getClass());
}
}
