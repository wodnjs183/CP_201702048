package test;

public class test {
	void sub(int... v) {
		System.out.println("�μ��� ���� :" + v.length);
		
		for (int x: v)
			System.out.print(x+" ");
		System.out.println();
	}

}
