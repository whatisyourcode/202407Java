package java0729;

import java.util.Date;

class Aa {
	String ss = "Aa 클래스";

	@Override
	public String toString() {
		return "Aa [ss=" + ss + "]";
	}
	
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		Aa aa = new Aa();
		System.out.println(aa.toString());
		Class clazz = Aa.class;
		System.out.println(clazz);
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
	}

}
