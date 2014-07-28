/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author William
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		ListaNodos pila = new ListaNodos();
		String _operacion = "12+4-2*4*";
		String signo = "";
		String str1 = "";
		int num3 = 0;
		int counter = 0;
		String[] postfix = _operacion.split("");

		for (int i=1; i<postfix.length; i++)
		{
			pila.Push(postfix[postfix.length-i]);
			

		}


		for(int i=0; i<4; i++)
		{
		
			String op1 = pila.Pop();
			System.out.println(op1);
			
			String op2 = pila.Pop();
			System.out.println(op2);
			
			signo = pila.Pop();

			int num1 = Integer.parseInt(op1);
			int num2 = Integer.parseInt(op2);
			

			if (new String(signo).equals("+"))
			{
				System.out.println("suma");
				num3 = num1 + num2;
			}
			if (new String(signo).equals("-"))
			{
				System.out.println("resta");
				num3 = num1 - num2;
			}
			if (new String(signo).equals("*"))
			{
				System.out.println("multiplicacion");
				num3 = num1*num2;
			}
			if (new String(signo).equals("/"))
			{
				System.out.println("division");
				num3 = num1/num2;
			}
			
			str1 = Integer.toString(num3);
			
			pila.Push(str1);

			
			
		}

		String resultado = pila.Pop();
		System.out.println(resultado);
		
        // TODO code application logic here
    }
}
