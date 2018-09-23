import java.util.Scanner;
public class DectoHex{
	public static void main(String [] args){
		//create scanner to add number
		Scanner input=new Scanner(System.in);

		//input decimal value
		System.out.print("Enter the decimal value :- ");
		int dec=input.nextInt();
		int dec1=dec;

		//define hexa value
		String hex=" ";

		//calculate hexa value
		while(dec!=0){
			int hexvalue=dec%16;

			//convert to hexa
			char hexdigit=(hexvalue>=0&&hexvalue<=9)?(char)(hexvalue+'0'):(char)(hexvalue-10+'A');
			hex=hexdigit+hex;

			//divide from 16
			dec=dec/16;
		}
		System.out.println("The hexa value of "+dec1+" is "+hex);
	}
}