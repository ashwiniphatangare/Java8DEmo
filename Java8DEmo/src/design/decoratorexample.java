package design;
interface girl {
String description="this is art";
public String getDetail();

}
// class grilexample implements girl {
////	String description="educated girl";
//	 
//	public String getDetail() {
//		String description="educated girl";
//
//		return description;
//		
//	}
//	
//
//}
class AmericanGirl implements girl{
	protected girl g;
	public AmericanGirl(girl g) {
		super();
		this.g = g;
	}
public String getDetail() {
		// TODO Auto-generated method stub
		String description="american girl";
		return g.getDetail();
	}
}
class UropianGirl implements girl{
	protected girl g;

	public UropianGirl(girl g) {
		super();
		this.g = g;
	}
@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		String description = "uropian girl";

		return g.getDetail();
	}
}
  class girlDecorator implements girl{
	//structuralDecorator decor.decor;
	
	public  String getDetail() {
		String description="decor girl";
		return description;
	}
	
}
class Art extends girlDecorator{
private girl g;
	public Art(girl g) {
	super();
	this.g = g;
}
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		System.out.println("Art girl");
		return g.getDetail();
	}
	
}
class science12 extends girlDecorator{
	private girl g;
	public science12(girl g) {
		super();
		this.g = g;
	}
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		System.out.println("science girl");
		return g.getDetail();
	}
	
}
public class decoratorexample {

	//private static girl g;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	girlDecorator gc=new girlDecorator();
	Art a=new Art(gc);
	System.out.println(a.getDetail());

	girlDecorator gc1=new girlDecorator();

	science12 sc=new science12(gc1);

		//girl g=new girl();
		
		
	}
	

}
