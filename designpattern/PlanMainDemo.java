package designpattern;

public class PlanMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomesticPlan d=new DomesticPlan();
		d.getRate();
		d.calculateBill(34);
		
		CommercialPlan c=new CommercialPlan();
		c.getRate();
		c.calculateBill(40);
		
		InstitudePlan  i=new InstitudePlan ();
		i.getRate();
		i.calculateBill(30);
	}

}
