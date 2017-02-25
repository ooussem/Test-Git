class PointHD
{
	private float x,y;
	String toto;
	
	
	//************************** Contructeur ****************************************
	//Contructeur par défaut
	public PointHD()
	{
		this(0,0);
	}
	
	// Constructeur exhaustif
	public PointHD(int abs,int ord)
	{
		this.setPointX(abs);
		this.setPointY(ord);
	}

	//Constructeur de vraie copie
	public PointHD(Point p)
	{
		this(p.x, p.y);
	}
	
	//*******************************************************************************
	/*
	void bouger(int newX,int newY)
	{
		this.setPointX(newX);
		this.setPointY(newY)
	}

	void translater(int dx,int dy)
	{
		this.x += dx;	
		this.y +=dy;
	}
	double DistanceOrigine()
	{
		double r = Math.sqrt(this.x*this.x+this.y*this.y);
		return r;
	}
	double DistancePoint(Point p)
	{
		
		double r = Math.sqrt(Math.pow((this.x-p.x),2)+ Math.pow((this.y-p.y),2));
		return r;
	}
	void LeSymetrique()
	{
		int z;
		z=this.x;
		this.x=this.y;
		this.y=z;
	}
	*/
	
	public void positionne()
	{
		
	}
	//*********************************** Getters **************************************
	
	public float getPointX()
	{
		return this.x;
	}
	
	public float getPointY()
	{
		return this.y;
	}
	
	//*********************************** Setters **************************************
	
	public void setPointX(int x)
	{
		if(x >= 0 || x<= 1919)
		{
			this.x = x;
		}
		else if (x > 1079)
			this.x = 1079;
		else
			this.x = 0;
	}
	
	public void setPointY(int y)
	{
		if(y >= 0 || y <= 1079)
		{
			this.y = y;
		}
		else if(y>1079)
			this.x = 1079;
		else
			this.y = 0;
	}
	
	//******************************** toSting et affiche**************************************
	
	public String toString()
	{
		String str = "";
		str += "Objet de type " +this.getClass()+ " : qui a un point x de coordonnée : " +this.getPointX();
		str += "et un point y de coordonnée : " +this.getPointY();
		
		return str;
	}
	
	public void affiche()
	{
		System.out.println(this.toString());
	}
	
	
	
}