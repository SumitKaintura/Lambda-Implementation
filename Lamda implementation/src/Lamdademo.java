
public class Lamdademo {
	
	public static void main(String[] args)
	{
		//FunctionalInterfaceDemo ob=(a, b)->System.out.println(a+b);
		//ob.add(34,45);
		
		//BlockLamda
		
		FunctionalInterfaceDemo ob2=(a,b)->{
			
			int c;
			c=a+b;
			return c;
		};
		System.out.println("it returned me "+ob2.add(45,67));
	}

}
