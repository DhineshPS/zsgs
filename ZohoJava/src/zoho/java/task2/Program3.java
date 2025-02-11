/*3) Write a program for the following. Let consider 20 students in a class with the roll no
101-120. We are going to split them into four groups. Based on their roll number we are
going to split them with the following logics.
Example 1:
Input : Total Number of students : 20
Output:
Group 1:
101
105
109
113
117
Group 2:
102
106
110
114
118
Group 3:
103
107
111
115
119
Group 4:
104
108
112
116
120
*/
package zoho.java.task2;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 101, num2 = 120;
		ArrayList<Integer> g1 = new ArrayList<Integer>();
		ArrayList<Integer> g2 = new ArrayList<Integer>();
		ArrayList<Integer> g3 = new ArrayList<Integer>();
		ArrayList<Integer> g4 = new ArrayList<Integer>();
		
		for(int i = num1; i <= num2;)
		{
			g1.add(i++);
			if(i > num2)
				break;
			g2.add(i++);
			if(i > num2)
				break;
			g3.add(i++);
			if(i > num2)
				break;
			g4.add(i++);
		}
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
	}

}
