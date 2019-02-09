package test;

public class CloseBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		Integer it = new Integer(i);
		int i2 = it.intValue();
		int i3 = it;
		System.out.println(i2);
		System.out.println(it instanceof Number);
		System.out.println(i3);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("--------------");
		byte b = 25;
		Byte bb = new Byte(b);
		byte b2 = bb.byteValue();
		System.out.println(b2);
	}

}
