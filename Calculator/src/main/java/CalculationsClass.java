public class CalculationsClass {
	public double addition(double a, double b)
	{
		double sum=a+b;
		return sum;
	}
	
	public double substraction(double a, double b)
	{
		double sub=a-b;
		return sub;
	}
	
	public double multiplication(double a, double b)
	{
		double mult=a*b;
		return mult;
	}
	
	public double division(double a, double b)
	{
		double div=0;
		try {
			
			div=a/b;
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		return div;
	}
	
}
