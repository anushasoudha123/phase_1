import java.util.*;  
public class Maps 
{
	 public static void main(String args[])
	 {  
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  
	  map.put(1,"INDIA");  
	  map.put(2,"USA");  
	  map.put(3,"UK");  
	  //Elements can traverse in any order  
	  for(Map.Entry m:map.entrySet())
	  {  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
}