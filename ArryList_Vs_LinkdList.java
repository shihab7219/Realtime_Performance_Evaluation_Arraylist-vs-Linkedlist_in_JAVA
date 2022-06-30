package Collections_FrameWork;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArryList_Vs_LinkdList {
	
	private static final int ELCOUNT = 50000;
	
	public static void main(String[] args) {
		
	
	
		ArrayList<Integer> arlist = new ArrayList<>();
	
		LinkedList<Integer> lnlist = new LinkedList<>();
		
		
		//Insertion ------->>
		
		//ArrayList ------->>
		
		long start = System.currentTimeMillis();
		for(int i =0 ; i<ELCOUNT;i++)
		{
			arlist.add( i);
		}
		long totaltime = System.currentTimeMillis()-start;
		System.out.println("Adding 50k Elements in ArrayList took : " + totaltime + "ms" );
		
		
		//LikedList----->>
		start  = System.currentTimeMillis();
		
		for(int i =0 ; i < ELCOUNT ; i++ )
		{
			lnlist.add(i);
		}
		totaltime = System.currentTimeMillis() - start;
		System.out.println("Adding 50k Elements in LinkedList took : " + totaltime + "ms");
		
		
		//Modification ----->>
		
		//ArrayList ------>>
		
		start = System.currentTimeMillis();
		for(int i =0 ; i<ELCOUNT ; i++)
		{
			arlist.set(i, i);
		}
		totaltime = System.currentTimeMillis()-start;
		System.out.println("Modifying 50K Elements in ArrayList took : " + totaltime + "ms");
		
		//LinkedList ------>>
		
		start = System.currentTimeMillis();
		for(int i = 0 ; i<ELCOUNT;i++)
		{
			lnlist.set(i, i);
		}
		totaltime = System.currentTimeMillis()-start;
		
		System.out.println("Modifying 50K Elements in LinkedList took : " + totaltime + "ms");
		
		
		//Remove
		System.out.println("ArrayList size before removing = " + arlist.size());
		System.out.println("LinkedList size before removing = " + lnlist.size());
		
		//ArrayList
		
		start = System.currentTimeMillis();
		for(int i = 0 ; i<ELCOUNT ; i ++)
		{
			arlist.remove(0);
		}

		totaltime = System.currentTimeMillis()-start;
		System.out.println("Removing 50K Elements in ArrayList took : " + totaltime + "ms");
		
		//LinkdList
		start = System.currentTimeMillis();
		for(int i = 0 ; i<ELCOUNT; i++)
		{
			lnlist.remove(0);
		}
		totaltime = System.currentTimeMillis()-start;
		System.out.println("Modifying 50K Elements in LinkedList took : " + totaltime + "ms");
		
		
		System.out.println("ArrayList size After removing = " + arlist.size());
		System.out.println("LinkedList size After removing = " + lnlist.size());
	
	
	

   }
}
