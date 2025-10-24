import java.util.*;
public class RemoveDuplicate{ 
{
	public static void main(String[] args) 
	{
         String s="programming";
      Set<Charater> set=new LinkedHashSet<>();
      for(int i=0;i<s.length();i++){
		  set.add(s.charAt(i));
	  }
	  for(Charater c:set){
		  System.out.println(c);
	  }
	}
}
