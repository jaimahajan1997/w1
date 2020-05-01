import java.nio.channels.ShutdownChannelGroupException;
import java.nio.charset.spi.CharsetProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map= new HashMap<Character, Integer>();
		//Assuming question was slightly wrong and prime nos start from 2 not 1.
map.put('A',2);map.put('B',3);map.put('C',5);map.put('D',7);map.put('E',11);map.put('F',13);map.put('G',17);map.put('H',19);map.put('I',23);map.put('J',29);map.put('K',31); map.put('L',37);map.put('M',41);map.put( 'N',43);map.put( 'O',47);map.put('P',53);map.put( 'Q',59);map.put('R',61);map.put('S',67); map.put('T',71); map.put('U',73); map.put('V',79);map.put( 'W',83);map.put( 'X',89);map.put( 'Y',97);map.put('Z',101);
		System.out.println(map);
		Scanner sc=new Scanner(System.in);
		char[] name=sc.next().toCharArray();
		
		for(int i=0;i<name.length;i++) {
			System.out.print(Integer.toHexString(map.get(name[i])));
		}
	}

}
