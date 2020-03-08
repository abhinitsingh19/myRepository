package Immutable;

import java.util.Date;

public final class ImmutableClass 
{

	final Date  d ;
	
	public ImmutableClass(Date d) 
	{
		this.d =new Date(d.getTime());
	}
	
	Date get()
	{
	 return new Date( d.getTime()) ;
	 
	}
	
	public static void main(String[] args) 
	{
		Date d = new  Date(System.currentTimeMillis());
		ImmutableClass im=  new ImmutableClass(d);
		long time=24234234;
		im.get().setTime(time);
		System.out.println(d);
	}
	
}
