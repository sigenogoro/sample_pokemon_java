import java.util.Arrays;
import java.util.Random;


class Enemy extends PokemonInfo{

    protected int hp = 200;
    public String[] moves = {"10万ボルト","アイアンテール", "しっぽをふる", "カミナリ"};
    protected String[] details = {"電気タイプの技","ノーマルタイプの技","相手の防御力を落とす","電気タイプの技"};
    protected int[] moveDamage = {80, 50, 0, 80};
    protected int defensePower = 40;



    Enemy(String name){
        super(name);
    }

    public void setHp(int damage){
        if(damage == 0){
            this.setDownDefansePower();
            System.out.println("ゼニガメの防御力が10下がった！");
        }else{
            this.hp -= (damage - defensePower);
            System.out.println("ゼニガメは"+ damage + "のダメージを食らった");
        }
        System.out.println("ゼニガメの残りHPは" + this.hp + "です");
    }


    public int enemyMove(){
        Random rand = new Random();
        int num = rand.nextInt(3);
        System.out.println(num);
        if(num == 2){
            this.setUpDefansePower();
        }
        return this.moveDamage[num];
    }

    public void setUpDefansePower(){
        this.defensePower += 10;
    }

    public void setDownDefansePower(){
        this.defensePower -= 10;
    }

}