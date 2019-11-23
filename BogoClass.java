public class BogoClass {

	public static void main(String[] args) {
		int[] i = {1, 5, 2, 8, 12, 23, 44, 3};
		new BogoClass(i);
	}
	
	public BogoClass(int[] i) {
		int zaehler = 0;
		System.out.println("es werden " + i.length + " elemente sortiert...");
		while(!isSortiert(i)) {
			mischeln(i);
			zaehler++;
		}
		System.out.println("fertig (" + zaehler + " versuche)");
		print(i);
	}
	
	private void print(int[] i) {
		for(int x : i) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}

	private void mischeln(int[] i) {
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean isSortiert(int[] i) {
		for(int x = 0; x < i.length - 1; ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}
}