import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    String[] names = {"ピカチュウ","ゼニガメ"};
    System.out.println("あなたのポケモンは："+ names[0]);
    Hero hero = new Hero(names[0]);
    Enemy emeny = new Enemy(names[1]);
    System.out.println("バトルを始めます!!");

    while(true){
      hero.moveInfo();
      Scanner scannerDamage = new Scanner(System.in);
      System.out.print("あなたはどの技を使いますか?(番号を入力ください):");
      int damage = hero.decisionMove(scannerDamage.nextInt());

      hero.setHp(damage);
      if(hero.getHp() <= 0 || emeny.getHp() <= 0){
        System.out.println("バトル終了");
        break;
      }
    }
  }

}