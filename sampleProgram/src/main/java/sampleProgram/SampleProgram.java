package sampleProgram;
import java.util.Iterator;
import java.util.LinkedList;

public class SampleProgram {
	

	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedList<String>l=new LinkedList<String>();
			l.add("Apple");
			l.add("Orange");
			l.add("Banana");
			System.out.println(" For Loop ");
			for(int i=0;i<l.size();i++) {
				System.out.println(l.get(i));
			}
	System.out.println(" Advanced For Loop ");
	for(String str:l) {
		System.out.println(str);
	}
	System.out.println(" Iterator");
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	System.out.println("While Loop");
	int i=0;
	while(l.size()>i) {
		System.out.println(l.get(i));
		i++;
	}
		}

	}



