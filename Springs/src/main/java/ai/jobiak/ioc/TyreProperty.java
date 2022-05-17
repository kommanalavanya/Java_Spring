package ai.jobiak.ioc;

public class TyreProperty {
     private String brand;
     public TyreProperty() {
		// TODO Auto-generated constructor stub
	}
     
	public TyreProperty(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "It is working";
	}
     
}
