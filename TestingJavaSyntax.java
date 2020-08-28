/*

	Commentaries and stuff
	my name here
	Signature
	Blablabla

*/

public class TestingClass 
{
	public static void main(String[] args) 
	{
		// declaration of love
		String Line = "string here";
		int Number = 42;
		final float pi = 3.14159f;
		boolean truebool = true;

		// loopingas
		for (int i = 0; i < 4; i++) 
		{
			switch(i)
			{
				case 0:
					System.out.println("String: " + Line);
					break;
				case 1:
					System.out.println("Int: " + Number);
					break;
				case 2:
					System.out.println("Float: " + pi);
					break;
				case 3:
					System.out.println("Boolean: " + truebool);
			}
		}
	}
}