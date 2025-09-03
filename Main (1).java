import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	   
	    Scanner numero = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro número: ");
	    int num1 = numero.nextInt();
	    
	    System.out.println("Digite o segundo número: ");
	    int num2 = numero.nextInt();
	    
	    int subtracao = num1 - num2;
	    System.out.println("O resultado da subtração é: " + subtracao);
	    
	    int multiplicacao = num1 * num2;
	    System.out.println("O resultado da multiplicação é: " + multiplicacao);
	    
	    int divisao = num1 / num2;
	    System.out.println("O resultado da divisão é: " + divisao);
	    
  }
}