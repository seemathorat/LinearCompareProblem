public class LineCompare{
	

	public static void main(String[] args){
	int x1=3;
	int y1=4;
	int x2=5;
	int y2=6;
   double length=Math.sqrt((x2-x1)^2 + (y2-y1)^2);	
	
	System.out.println("length of the line is : "+length);
	System.out.println("Check The Equality of the two lines ");
	System.out.println(x1==(y1));
	System.out.println(y1==(x1));
	System.out.println(y2==(x1));
	System.out.println(x2==(y1));
	System.out.println(x2==(y2));
	
	System.out.println("Compare lines");
	//System.out.println(x1.compareTo(5));
	System.out.println(Integer.compare(x1,y2));
	}
}

