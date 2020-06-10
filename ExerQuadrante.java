
public class ExerQuadrante {

	public static void main(String[] args) {
		
		int x= -3;
		int y= 4;
		
		if ((x > 0) && (y > 0))
		{
			System.out.println("primeiro quadrante"); 
		} else if ((x < 0) && (y < 0))
		{
			System.out.println("terceiro quadrante"); 
		} else if ((x < 0) && (y > 0))
		{
			System.out.println("segundo quadrante"); 
		}

		else //((x > 0) && (y < 0))
		{
			System.out.println("quarto quadrante");
		}
		
	}
}
	
