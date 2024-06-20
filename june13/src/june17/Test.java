package june17;
import java.util.*;

import java.text.*;


public class Test {
	public Integer val;

	public void fun1() {

	Integer grade1 = new Integer(25);

	val = grade1;

	fun2(grade1);

	}

	private void fun2(Integer grade2) {

	grade2 = grade2 .intValue();

	if(grade2==val) {

	System.out.println("equal");

	}

	else {

	System.out.println("not equal");

	}

	}
	public static void main(String[] args) {
		Test t = new Test();
		t.fun1();
	}

		}
		
	
	


		

		


