import java.util.*; 

public class password
{ 
	static char[] OTP(int len) 
	{ 
		System.out.println("Generating OTP/Password using random() : "); 
		System.out.print("Your One Time Password (OTP) is : "); 

		String numbers = "0123456789"; 
 
		Random rndm_method = new Random(); 

		char[] otp = new char[len]; 

		for (int i = 0; i < len; i++) 
		{ 
			otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length())); 
		} 
		return otp; 
	} 
	
	static char[] New_Password(int len) 
	{ 
		System.out.println("Generating password using random() : "); 
		System.out.print("Your new password is : "); 

		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
		String numbers = "0123456789"; 
		String symbols = "!@#$%^&*_=+-/.?<>)"; 

		String values = Capital_chars + Small_chars + numbers + symbols; 

		Random rndm_method = new Random(); 

		char[] password = new char[len]; 

		for (int i = 0; i < len; i++) 
		{ 
			password[i] = values.charAt(rndm_method.nextInt(values.length())); 

		} 
		return password; 
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice for Generation: "); 
		System.out.println("Press 1 for OTP ");
		System.out.println("Press 2 for New Password ");
		int n = sc.nextInt();
		if(n==1) {
			int length = 4;
			System.out.println(OTP(length)); 
		}
		else {
			int length = 10;
			System.out.println(New_Password(length)); 
		}
		sc.close();
	} 
}  
