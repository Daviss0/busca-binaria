import java.util.Scanner;

public class App {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
    int vetor [] = new int [10];
    preencheVetor (vetor, 0);
    imprimirMensagem (vetor, 0);
    
    System.out.println("qual valor deseja encontrar?");
    int valorBuscado = entrada.nextInt();
    int valorEncontrado = buscaBinaria (vetor,valorBuscado, 0 , vetor.length - 1);
    if (valorEncontrado == -1) {
    	System.out.println("valor nao encontrado");
    }
    else {
    	System.out.println("valor encontrado na posicao "+valorEncontrado);
    }
    }
    
    public static void preencheVetor (int vetor[], int indice) {
    	if (indice < vetor.length) {
    		vetor[indice] = indice * 3;
    		preencheVetor (vetor, indice + 1);
    	}
    }
    
    public static void imprimirMensagem (int vetor[], int indice) {
    	if (indice < vetor.length) {
    		System.out.println(vetor[indice]);
    		imprimirMensagem (vetor, indice + 1);
    	}
    }
    
    public static int buscaBinaria (int vetor[], int valorBuscado, int inicio, int fim) {
    	 if (inicio > fim) {
             return -1;
         }
         int meio = (inicio + fim) / 2;
         if (meio >= vetor.length) {
             return -1;
         }
         if (vetor[meio] == valorBuscado) {
             return meio;
         } else if (vetor[meio] < valorBuscado) {
             return buscaBinaria(vetor, valorBuscado, meio + 1, fim);
         } else {
             return buscaBinaria(vetor, valorBuscado, inicio, meio - 1);
         }
     }
 }
