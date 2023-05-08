package ordenacao;

public class Principal {

	public static void main(String[] args) {
		Vetor numbers = new Vetor();
		numbers.preencherVetor();
		numbers.imprimirVetor("Original: ");
		
		Ordenacao ordenacao = new Ordenacao();
		//ordenacao.bubbleSort(numbers.getVetor());
		//ordenacao.selectSort(numbers.getVetor());
		ordenacao.insertSort(numbers.getVetor());
		numbers.imprimirVetor("Insert Sort: "); 
	}

}
