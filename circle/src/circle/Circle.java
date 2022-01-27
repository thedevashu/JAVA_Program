package circle;

public class Circle {
	private int rad;
	private Point pts;
	
	
	public Circle(int r ) {
		rad = r;
		pts = new Point(0,0);
	}
	
	public Circle(int r ,int x,int y) {
		rad = r;
		pts = new Point(x,y);
		
	}
	public String toString() {
		String str ="Radius = " + rad + " center " +pts ;
		return str;
	}

	public boolean isIntersect(Circle c2) {
		int radSum = this.rad + c2.rad;
		int xsqr = (this.pts.getX()-c2.pts.getX())*(this.pts.getX()-c2.pts.getX());
		int ysqr = (this.pts.getY()-c2.pts.getY())*(this.pts.getY()-c2.pts.getY());
		double dis = Math.sqrt(xsqr + ysqr);
		
		if(radSum < dis) {
			return false;
		}
		else
		return true;
		// TODO Auto-generated method stub
		
	}
}
