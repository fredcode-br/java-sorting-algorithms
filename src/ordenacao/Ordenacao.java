package ordenacao;

public class Ordenacao {
	public void bubbleSort(int numbers[]) {
		int aux = 0;
		for(int i=0; i < numbers.length; i++){
			for(int j=1; j < numbers.length-i; j++) {
				if(numbers[j-1] > numbers[j]) {
					aux = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = aux;
				}
			}
		}
	}
	
	public void insertSort(int numbers[]) {
		int aux = 0;
		for(int i = 0; i < numbers.length-1; i++) {
			if(numbers[i] > numbers[i+1]) {
				aux = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = aux;
			}
			for(int j = i; j > 0; j--) {
				if(numbers[j] < numbers[j-1]) {
					aux = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = aux;
				}
			}
		}
	}
	
	public void selectSort(int numbers[]) {
		for(int i = 0; i < numbers.length; i++) {
			int smaller = i;
			for(int j = i; j < numbers.length; j++) {
				if(numbers[j] < numbers[smaller]){
					smaller = j;
				}
			}
			int aux = numbers[i];
			numbers[i] = numbers[smaller];
			numbers[smaller] = aux;
		}
	}
}
