package Com.Day3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pen implements Comparable<Pen>
{
	
	private String brandname;
	private float price;
	private int penno;
	private char quality;
	
	public Pen(String brandname,float price,int penno,char quality)
	{
		this.brandname=brandname;
		this.price=price;
		this.penno=penno;
		this.quality=quality;
	}
	
	public String toString()
	{
		return "Pen[brandname="+brandname+", price="+price+",penno="+penno+",quality="+quality+"]";
	}
	public int compareTo(Pen o)
	{
		if(this.penno==o.penno)
		{
			return 0;
		}
		else if(this.penno>o.penno)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Pen p1= new Pen("Rorito",10,1,'A');
		Pen p2=new Pen("Apsara",15,3,'B');
	    Pen p3=new Pen("Bright",5,2,'C');
	    List<Pen>penList=new ArrayList<Pen>();
	    
	    penList.add(p1);
	    penList.add(p2);
	    penList.add(p3);
	   
	    Collections.sort(penList);
	    System.out.println(penList);
		
		}
	
}


