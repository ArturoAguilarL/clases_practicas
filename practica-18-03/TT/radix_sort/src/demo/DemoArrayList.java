package demo;

import java.util.ArrayList;

public class DemoArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<10;i++)
		{
			al.add(i);
		}
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}
}
