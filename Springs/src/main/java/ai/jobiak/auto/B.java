package ai.jobiak.auto;

import org.springframework.stereotype.Component;

@Component
public class B {
    int x=5;
    int y=6;
    public B() {
		// TODO Auto-generated constructor stub
	}
	public B(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "B [x=" + x + ", y=" + y + "]";
	}
    
}
