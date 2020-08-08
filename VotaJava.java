import java.util.Scanner;

public class VotaJava{
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos anos voce tem?");
        int idade = scanner.nextInt();
        if(idade >= 18)	{
        	System.out.println("Voto Obrigatorio");
        } else {
        	System.out.println("Voto Nao Obrigatorio");
        }	
      
    }
}