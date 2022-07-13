package javaJiraia.collections;

public class Equals {
	public static void main(String[] args) {
		
		Smartphone s1 = new Smartphone("0T5BJ","Iphone");
		Smartphone s2 = new Smartphone("0T5BJ","Iphone");
		
		System.out.println(s1 == s2); //duas instancias distintas
		System.out.println(s1.equals(s2));
	}
}
