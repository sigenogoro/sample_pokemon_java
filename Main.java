import java.util.Random;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
      String[] names = {"ピカチュウ","ゼニガメ"};
      System.out.println("あなたのポケモンは："+ names[0]);
      System.out.println("相手のポケモンは："+ names[1]);
      Hero hero = new Hero(names[0]);
      Enemy enemy = new Enemy(names[1]);
      System.out.println("バトルを始めます!!");
      System.out.println("===================");

      while(true){

        hero.moveInfo(hero.getMove(), hero.getDetalis(),hero.getMoveDamage());

        Scanner scannerDamage = new Scanner(System.in);

        System.out.print("あなたはどの技を使いますか?(番号を入力ください):");

        int damage = hero.decisionMove(scannerDamage.nextInt(), hero.getMoveDamage());

        int selfDamage = enemy.enemyMove();
        Random r = new Random();

        if(r.nextInt(10) >= 5){
          hero.setHp(selfDamage);
          enemy.setHp(damage);
        }else{
          enemy.setHp(damage);
          hero.setHp(selfDamage);
        }

        if(enemy.getHp(enemy.hp) <= 0){
          System.out.println("ゼニガメのHPがゼロになった！");
          System.out.println("あなたの勝利です");
          break;
        }else if(hero.getHp(hero.hp) <= 0){
          System.out.println("ピカチュウのHPがゼロになった！！");
          System.out.println("あなたの負けです");
          break;
        }else{
          if(r.nextInt(10) >= 5){
            hero.setHp(selfDamage);
            enemy.setHp(damage);
          }else{
            enemy.setHp(damage);
            hero.setHp(selfDamage);
          }
        }
      }

    System.out.println("===================");
    System.out.println("バトル終了します。");
  }



}