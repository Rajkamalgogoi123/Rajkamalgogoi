import java.util.*;
class Re1
{
	public static void main(String args[])
	{
		Random randomGenerator=new Random();
		ArrayList<String> people=new ArrayList<String>(10);
		people.add("a");
		people.add("b");
		people.add("c");
		people.add("d");
		people.add("e");
		people.add("f");
		people.add("g");
		people.add("h");
		people.add("i");
		people.add("j");
		ArrayList<Integer> list=new ArrayList<Integer>();
		int number=people.size();
		while(number>0)
		{
			for(int i=0;i<number;i++)
			{
				list.add(randomGenerator.nextInt(number) + 1);
			}
			int indexx=list.indexOf(Collections.max(list));
			System.out.println(people.get(indexx));
			people.remove(indexx);
			list.clear();
			number--;
		}
	}
}