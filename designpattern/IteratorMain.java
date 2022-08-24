package designpattern;

public class IteratorMain {

	public static void main(String[] args) {
		CollectionNames  compnyRespository = new CollectionNames ();
		Object compnyRepostory;
		for(Iterator iter = compnyRepostory.getIterator();
				iter.hasNext();)
		{
			String name =(String)iter.next();
			System.out.println( "name:"+name);
		}
				
				{
					
				}
	

	}

}
