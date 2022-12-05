package practice.map.heirachy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	HashMap m=new HashMap();
	m.put("marish",101);
	m.put("pranav",701);
	m.put("vaibhav",302);
	m.put("mukund",504);
	System.out.println(m);//put()
	System.out.println(m.put("marish",201));
	
	
	Set s=m.keySet();//keySet()
	System.out.println(s);
	
	Collection s1=m.values();//values()
	System.out.println(s1);
//	
	Set s3=m.entrySet();//entrySet();
	System.out.println(s3);
//	
//	 
	Iterator itr=s3.iterator();
	while(itr.hasNext())
	{
	 Map.Entry m1=(Map.Entry)itr.next();
	 System.out.println(m1.getKey()+" "+m1.getValue());//getKey() & getValue()
	 
	 if(m1.getKey().equals("marish"))
	 {
		 m1.setValue(5000);//setValue();
	 }
	}
	System.out.println(m);
}
}
