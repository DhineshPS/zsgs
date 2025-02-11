//15) Java Program to print the duplicate elements of an array

package zoho.java.task2;
import java.util.HashMap;
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 3, 2, 4, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr)
        {
        	if(map.containsKey(num))
        		map.put(num, map.get(num) + 1);
        	else
        		map.put(num, 1);
        }
        for(int key : map.keySet())
        {
        	if(map.get(key) > 1)
        		System.out.println(key);
        }
	}

}
