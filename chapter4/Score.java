public class Score {
	public static void main(String[] args) { 
		/*int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 80;
		
		int sum = sansu + kokugo + rika + eigo + syakai;
		
		int avg = sum / 5;
		
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
		
		int[] scores = new int[5];
		scores[1] = 30;
		System.out.println(scores[1]);*/
		
		int[] scores = {20,30,40,50,80};
		int sum = 0;
		for (int i = 0;i < scores.length;i++) {
		  sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
		
		int count = 0;
		for (int i = 0;i < scores.length;i++) {
		  if (scores[i] >= 50) {
		    count++;
		  }
		}
		System.out.println("50点以上の科目の数は" + count);
	}
}