
 interface girl {
 String description="this is art";
public String getDetail();
 
}
public abstract class grilexample implements girl {
	String description="educated girl";
	public String getDetail() {
		return description;
		
	}
	

}
class AmericanGirl implements girl{
	public AmericanGirl(){
		String description="american girl";
	}

	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return null;
	}
}
class UropianGirl implements girl{
	public UropianGirl(){
		String description = "uropian girl";
	}

	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return null;
	}
}
abstract class girlDecorator implements girl{
	//structuralDecorator decor.decor;
	public abstract String getDetail() ;
	
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
 abstract class science12 extends girlDecorator{
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
 public class grilexample{
public static void main(String[] args) {
	girl science=new science(new AmericanGirl());
	science.getDetail();
	girl Art=new Art(new AmericanGirl());
	Art.getDetail();

}
}