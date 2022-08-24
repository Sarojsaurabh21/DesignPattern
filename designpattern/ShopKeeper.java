package designpattern;

public class ShopKeeper {
	
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;
	
	public  ShopKeeper()
	{
		iphone= new IPhone();
		samsung=new Samsung();
		blackberry=new Blackberry();
	}
	
	public void iphoneSal()
	{
		iphone.modelNo();
		iphone.price();
		
	}
	
	public void samsungSal()
	{
		samsung.modelNo();
		samsung.price();
	}
	
	
	public void blackBerrysal()
	{
		blackberry.modelNo();
		blackberry.price();
	}

	
	
	

}
