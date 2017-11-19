package test;

public class test {
	void sub(int... v) {
		System.out.println("인수의 갯수 :" + v.length);
		
		for (int x: v)
			System.out.print(x+" ");
		System.out.println();
	}

}
