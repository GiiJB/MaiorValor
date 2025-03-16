package maiorvalor;

/**
 *
 * @author Giovanna Jesus Borba
 * Data de edição: 16/03/2025
 * Objetivo: Apresentar o maior valor digitado pelo usuário
 */
import java.util.Scanner;

    public class MaiorValor {

    public static void main(String[] args) {
       //Criando o objeto leitor do tipo Scanner para receber dados que serão diitados pelo usuário
        Scanner leitor = new Scanner (System.in);
        
        //Declaração das variáveis de entrada
        int valor1_int, valor2_int, valor3_int;
        
        //Entrada de dados
        System.out.println("Digite valores positivos e inteiros");//Orientação para que o usuário digite valores positivos e inteiros
        System.out.println("Digite o primeiro valor: ");//Solicitação para que seja digitado o primeiro valor
        valor1_int = leitor.nextInt();//O valor digitado será armazenado na variável valor1_int através do método .nextInt()
        System.out.println("Digite o segundo valor: ");//Solicitação para que seja digitado o segundo valor
        valor2_int = leitor.nextInt();//O valor digitado será armazenado na variável valor2_int através do método .nextInt()
        System.out.println("Digite o terceiro valor: ");//Solicitação para que seja digitado o terceiro valor
        valor3_int = leitor.nextInt();//O valor digitado será armazenado na variável valor3_int através do método .nextInt()
        
        //Estruturas de Decisão
        
        //Se o primeiro valor for maior que o segundo e o terceiro
        if(valor1_int > valor2_int && valor1_int > valor3_int){ 
            System.out.println("O primeiro valor digitado é o maior, sendo ele " + valor1_int);//Ele será apresentado ao usuário 
        }        
        
        //Se não for, será analisado o valor 2. Se este for maior que o primeiro e o terceiro valor
        else if(valor2_int > valor1_int && valor2_int > valor3_int){
            System.out.println("O segundo valor digitado é o maior, sendo ele  " + valor2_int);//O segundo valor será apresentado
        }         
        
        //Se os valores 1 e 2 não forem maiores, então o terceiro é o maior
        else{
            System.out.println("O terceiro valor digitado é o maior, sendo ele  " + valor3_int);//Sendo assim, será impresso o terceiro valor ao usuário
        }
    }
    
}
