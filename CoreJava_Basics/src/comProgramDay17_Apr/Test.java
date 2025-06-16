package comProgramDay17_Apr;

public class Test {
	
		public static void main(String[] args)
		{
			try
			{
			   throw new Demo("demo error");	
			}
			catch(Throwable e)
			{
				System.err.println(e.toString());
			}
		}

	}
	class Demo extends Exception
	{
		public Demo(String errorMessage)
		{
			super(errorMessage);
		}
	}




