import Geom.Point3D;

public class Player {

	public int id;
	public Point3D location;
	public double speed;
	public double radius;
	
	
	public Player(){
		
		this.id = 0;
		this.location = new Point3D(0, 0, 0);
		this.speed = 2;
		this.radius = 1;
		
	}
}
