public class Hungry {
  public static void main (String[] args) {
    int isHungry = 1;
    String food = "おにぎり";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("おなかがいっぱいです");
    } else {
      System.out.println("はらぺこです");
    }
    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }
  }
}