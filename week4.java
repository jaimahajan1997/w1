import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.awt.print.Printable;
import java.lang.reflect.Array;
import java.util.*;
/*
 * Jai Mahajan
 */
public class week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String arr[]= {"GoodMorning","Shubhodaya","Shubhohday","Bonjour"};
String arr2[]= {"good Evening","Shubha sange","susandhya","Bonsoir"};
 Map<String,List<String>> map=new HashMap<String,List<String>>();
map.put("GoodMorning",Arrays.asList(arr));
map.put("GoodEvening",Arrays.asList(arr2));
Scanner sc=new Scanner(System.in);
System.out.println("Enter word to search");

String word=sc.next();
if(map.containsKey(word)) {
	System.out.println(map.get(word));
}
else {
System.out.println("Not found.....if you want to add it enter Y... Then Enter Synonyms");
List<String> arr3 = new ArrayList<String>();
if(sc.next.equals("Y"){
String a=word;
while (!a.equals(" ")) {
	//System.out.println(a);
	a=sc.nextLine();
	arr3.add(a);
}
map.put(word, arr3);} 
System.out.println(map);}
	}

}
