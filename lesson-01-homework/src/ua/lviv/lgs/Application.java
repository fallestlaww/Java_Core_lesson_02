package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
//		Написати по одній змінній кожного типу примітивних типів даних
		byte a = 1;
		short b = 3;
		int c = 14;
		long d = 5l;
		float e = 6;
		double f = 12;
		char x = 24;
		boolean t = true;
		
//      Вивсети на консоль мінімальне і максимальне значення типів даних
		System.out.println("byte min = "+ Byte.MIN_VALUE);
		System.out.println("byte max = "+ Byte.MAX_VALUE);
		System.out.println("short min = "+ Short.MIN_VALUE);
		System.out.println("short max = "+ Short.MAX_VALUE);
		System.out.println("int min = "+ Integer.MIN_VALUE);
		System.out.println("int max = "+ Integer.MAX_VALUE);
		System.out.println("long min = "+ Long.MIN_VALUE);
		System.out.println("long max = "+ Long.MAX_VALUE);
		System.out.println("float min = "+ Float.MIN_VALUE);
		System.out.println("float max = "+ Float.MAX_VALUE);
		System.out.println("double min = "+ Double.MIN_VALUE);
		System.out.println("double max = "+ Double.MAX_VALUE);
		System.out.print("char min = ");
		System.out.println((int) + Character.MIN_VALUE);
		System.out.print("char max = ");
		System.out.println((int) + Character.MAX_VALUE);
		System.out.println("boolean min = false");
		System.out.println("boolean max = true");
		
//		Cтворити масив та винести мінімальне та максимальне значення в консоль
		int [] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("max = " + array1[9]);
		System.out.println("min = " + array1[0]);
		 }
		
	//first commit to github
}
