public class Account {
  public static void main (String[] args) {
    int[] moneyList = {121902, 8302, 5510};
    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }
    
    for (int m : moneyList) {
      System.out.println(m);
    }
  }
}