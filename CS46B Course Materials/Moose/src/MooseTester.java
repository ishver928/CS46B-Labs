//HIDE
import java.util.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class MooseTester {
	public static void main ( String args[] ) {
		new HashSet();
		ArrayList<Moose> arr = new ArrayList<> ();
		Moose a = new Moose ("Moose c", 1, 2 );
		Moose b = new Moose ("Moose b", 1, 3 );
		Moose c = new Moose ("Moose a", 2, 2 );
		Moose x = new Moose ("Moose a", 1, 2 );
		Moose y = new Moose ("Moose b", 1, 3 );
		Moose z = new Moose ("Moose c", 2, 2 );
		arr.add(a);
		arr.add(b);
		arr.add(c);
		arr.add(x);
		arr.add(y);
		arr.add(z);
		Herd1 herd1 = new Herd1 ();
		Herd2 herd2 = new Herd2 ();
		for (Moose m:arr ) {
			herd1.add(m);
			herd2.add(m);
		}
		
		TreeSet<Moose> h0 = new TreeSet<> ( herd1 );
		ArrayList<Moose> h1 = new ArrayList<> ( h0 );
		ArrayList<Moose> h2 = herd2.getSorted() ;
		boolean ok1 = h1.equals ( h2 );
		boolean ok2 = h1.equals ( arr );
		System.out.println (ok1);
		System.out.println ("Expected: " + "true");
		System.out.println (ok2);
		System.out.println ("Expected: " + "false");
		System.out.println (h1.size());
		System.out.println ("Expected: " + "5");
		System.out.println (h1.size());
		System.out.println ("Expected: " + "5");
	}
}
