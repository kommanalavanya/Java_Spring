package com.jobiak.ioc;


public class Connection {
public Connection getConnection() {
	System.out.println("providing the connection");
	return new Connection();
}
}
