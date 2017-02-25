class Point
{
	protected int x,y;
	
	//Contructeur par défaut
	public Point()
	{
		this(0,0);
	}
	
	// Constructeur exhaustif
	public Point(int abs,int ord)
	{
		this.x = abs;
		this.y = ord;
	}

	//Constructeur de vraie copie
	public Point(Point autrePoint)
	{
		this(autrePoint.x, autrePoint.y);
	}

	void bouger(int newX,int newY)
	{
		this.x = newX;
		this.y = newY;
	}
	
	void translater(int dx,int dy)
	{
		this.x += dx;	
		this.y +=dy;
	}
	double distanceOrigine()
	{
		double r = Math.sqrt(this.x*this.x+this.y*this.y);
		return r;
	}
	double distancePoint(Point p)
	{
		
		double r = Math.sqrt(Math.pow((this.x-p.x),2)+ Math.pow((this.y-p.y),2));
		return r;
	}
	void leSymetrique()
	{
		int z;
		z=this.x;
		this.x=this.y;
		this.y=z;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public boolean equals(Object obj)
	{
		boolean locRes = (this.getClass().getName() == obj.getClass().getName() );
		if(locRes)
			return ( (this.x == ((Point)obj).x) && (this.y == ((Point)obj).y) );
				
		else
			return false;
	}
	
	
	void affiche()
	{
		System.out.println(toString());
	}
	
	public String toString()
	{
		String str = "Un point de " +this.x+ " et " +this.y;
		return str;
	}
	
	
}