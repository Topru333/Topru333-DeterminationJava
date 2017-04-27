
public class Sorting {
	
	public Sorting(){
		
	}
	
	private void trace(String text){
		if(Main.sortLogger.isTraceEnabled()){
			Main.sortLogger.trace(text);
		}
	}
	private void traceMass(int[] mas){
		String string = "";
		for(int i:mas){
			string+= i+" ";
		}
		if(Main.sortLogger.isTraceEnabled()){
			Main.sortLogger.trace(string);
		}
	}
	
	public void Sort( int[] mas ){
		int N = mas.length;
		
		int low = 0;
		int high = N-1;
		
		int h = 0;
		boolean flag = true;
		traceMass(mas);
		trace("low - " + low + " high - " + high);
		while(low<high && flag){
			flag = false;
			for(int o = low; o < high; o++){ // проход массива от начала к концу, перемещение большего значения
				if(mas[o] > mas[o+1]){
					h = mas[o];
					mas[o] = mas[o+1];
					mas[o+1] = h;
					trace(""+mas[o] + " from " + (o+1) + " to " + o);
					flag = true;
				}
			}
			high--; // сокращение сортируемого диапазона от конца
			
			for(int i = high; i > low; i--){ // проход массива от конца к началу, перемещение меньшего значения
				if(mas[i-1] > mas[i]){
					h = mas[i];
					mas[i] = mas[i-1];
					mas[i-1] = h;
					trace(""+mas[i] + " from " + (i) + " to " + (i-1));
					flag = true;
				}
			}
			low++; // сокращение сортируемого диапазона от начала
			if(flag){
				trace("low - " + low + " high - " + high);
				traceMass(mas);
			}
		}
	}
}
