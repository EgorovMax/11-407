import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class Matrix{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // оборачиваем поток в ридер
		System.out.print("N:");
		String s = br.readLine(); // читаем с консоли
		int n = Integer.parseInt(s); // парсим в целочисленный тип
		int[][] matrix = new int[n][]; // объявляем массив
		System.out.println();
		for(int i = 0; i < n; i++){// цикл по строка
			matrix[i] = new int[n];//создаем столбцы
			for(int j = 0; j < n; j++){//цикл по столбцам
				if(i > j){
					matrix[i][j] = -1;
				}else if(i < j){
					matrix[i][j] = 1;
				}else{
					matrix[i][j] = 0;
				} 
				System.out.print(matrix[i][j]+ "\t");//выводим значения массива				
			}
			System.out.println();
		}
		
		
	}
}