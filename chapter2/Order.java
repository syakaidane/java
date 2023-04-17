public class Order {
  public static void main (String[] args) {
    
    /*String name = "すがわら";
    System.out.print("私の名前は");
    System.out.print(name);
    System.out.println("です");
    
    int a = 5;
    int b = 3;
    int m = Math.max(a,b);
    System.out.println("比較実験：" + a + "と" + b + "とで大きいほうは・・・" + m );
    
    String age = "31";
    int n = Integer.parseInt(age); //String型をint型に変換
    System.out.println("あなたは来年、" + ( n + 1 ) + "歳になりますね。"); */
    
    int r = new java.util.Random().nextInt(90); //実行するたびに結果は変わる
    System.out.println("あなたはたぶん、" + r + "歳ですね？");
    
    System.out.println("あなたの名前を入力してください。");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ、" + age + "歳の" + name + "さん");
  }
}