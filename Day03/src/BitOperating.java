
public class BitOperating {

	public static void main(String[] args) {
		
		byte a= 5; //0000 0101
		byte b =3; //0000 0011
		
		//비트곱(and)
		System.out.println(a & b); //0000 0001
		
		//비트합(or)
		System.out.println(a | b); //0000 0111
		
		//배타적논리합(xor) 다르면 1 같으면 0
		System.out.println(a ^ b); //0000 0110 

	}

}
