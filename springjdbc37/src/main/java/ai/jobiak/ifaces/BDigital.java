package ai.jobiak.ifaces;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class BDigital {
Printable printable;
PackingIface packing;

public Printable getPrintable() {
	return printable;
}
public BDigital() {
	// TODO Auto-generated constructor stub
}
public BDigital(PackingIface packing) {

	this.packing = packing;
}

public void setPrintable(Printable printable) {
	this.printable = printable;
}
/*public void publish() {
	printable.print();
}*/

public PackingIface getPacking() {
	return packing;
}

public void setPacking(PackingIface packing) {
	this.packing = packing;
}
public void publish() {
	printable.print();
	packing.doPacking();
}
@PostConstruct
public void doInit() {
	System.out.println("from init");
}
@PreDestroy
public void doDestroy() {
	System.out.println("from destroy");
}

}
