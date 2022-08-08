package design;
interface car{
	public void build();
}
class Chevrolet implements car{

	@Override
	public void  build() {
		// TODO Auto-generated method stub
		System.out.println("Chevrolet is buld");	}
	
}
class BMW implements car{

	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("BMW is buld");	}

	
}
class renaule implements car{

	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("RENAULT is buld");	}

	}
	

  class FacadeForCar{
	 private car bmw;
	 private car chevrolet;

	 private car renault;
	 public FacadeForCar(){
		 this.bmw=new BMW();
		 this.renault=new renaule();

		 this.chevrolet=new Chevrolet();

		 }
	 public void buildBmw1() {
		 bmw.build();
	 }
	 public void buildChevrolet() {
		 chevrolet.build();
	 }
	 public void buildRenault() {
		 renault.build();
	 }
	
}
public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeForCar fc=new FacadeForCar();
		fc.buildBmw1();
		fc.buildChevrolet();
		fc.buildRenault();
	}

}
