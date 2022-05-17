package ai.jobiak.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicle{
	@Autowired
    private TyreProperty tyre;
	@Override
	public void ride() {
		System.out.println("Chal raha hai car");
		
	}
	public TyreProperty getTyre() {
		return tyre;
	}
	public void setTyre(TyreProperty tyre) {
		this.tyre = tyre;
	}
	
   
}
