package designpattern;

public class CollectionNameIterator extends CollectionNames implements Iterator
{
int i;

@Override
public boolean hasNext() {
	
	if(i<name.length)
	{
		return true;
	}
	return false;
}

@Override
public Object next() {
	if(this.hasNext())
	{
		return name[i++];
	}
	return null;
}

}
