public class Point3D extends Point
{
	int z;
	
	
	public Point3D()
	{
		super();
		this.z =0;
	}
	
	public Point3D(int x, int y, int z)
	{
		super(x, y);
		this.z = z;
	}
	
	void bouger(int newX,int newY, int newZ)
	{
		this.bouger(newX, newY);
		this.z = newZ;
	}
	
	void translater(int dx,int dy, int dz)
	{
		this.translater(dx, dy);
		this.z = dz;
	}
	
	double distanceOrigine()
	{
		Point3D pointOrigine = new Point3D();
		return this.distancePoint(pointOrigine);
		//double r = Math.sqrt(this.x*this.x+this.y*this.y + this.z*this.z);
	}
	
	double distancePoint(Point3D p)
	{
		double r = Math.sqrt(Math.pow((this.x-p.x),2)+ Math.pow((this.y-p.y),2)+Math.pow((this.z-p.z),2));
		return r;
	}
	
	public int getZ()
	{
		return this.z;
	}
	
	public void setZ(int pZ)
	{
		this.z = pZ;
	}
	
	public String toString()
	{
		String str = super.toString();
		str += ", " +this.z;
		str += "\nDistance origine :" +this.distanceOrigine();
		return str;
		
	}
	
	
}