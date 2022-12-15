//11) Escreva um algoritmo para ler as dimensões de um trapézio (base maior, base menor e altura), 
//calcular e escrever a área do trapézio. a=(B+b).h/2  

import java.util.Scanner;

public class Exercicio11 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor da base maior");

int B= sc.nextInt();

System.out.println("Digite o valor da base menor");

int b= sc.nextInt();

System.out.println("Digite o valor da altura");

int h = sc.nextInt();

System.out.println ("A área do trapézio é de : " + B+b * h/2) ;

}}
