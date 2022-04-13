package random_between;
import java.util.*;

public class Random_Array_Bubble { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n : ");
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int r=0;r<data.length;r++){
            boolean kembar = true;
            while(kembar){
                kembar = false;
                int nilai = getAkuDanKamu(1, n);
                for(int s=0;s<r;s++){
                    if (nilai ==data[s]) {
                        kembar = true;
                        break;
                    }
                }
                if (!kembar) {
                    data[r] = nilai;
                }
            }
        }
        System.out.println(Arrays.toString(data));
        // Arrays.sort(data);
        // Bubble Sort
        int i, j;
        for (i = 0; i <= n - 2; i++) {
            for (j = 0; j <= n - i - 2; j++) {
                if (data[j] > data[j + 1]) {
                    int temp;
                    
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static int getAkuDanKamu(int min, int max) {

		if (min >= max) {
			int temp = max;
            max = min;
            min = temp;
		}
		return (int) (Math.random() * ((max - min) + 1)) + min;
	}
}
