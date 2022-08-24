package designpattern;

public class GetPlanFactory {
	
	public Plan getPlan(String planType)
	{
		if(planType==null)
		{
					
		return null;
		}
		
		if(planType.equalsIgnoreCase(" Do mesticPlan"))
		{
			return new DomesticPlan();
		}
		else
			if(planType.equalsIgnoreCase("Institutional"))
			{
				return new InstitudePlan();
			}
			else
				if(planType.equalsIgnoreCase("Commericial"))
				{
					return new CommercialPlan();
				}
				
		return null;
	}

}
