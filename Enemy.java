import java.util.Random;

class Enemy{
    private String name;
    private int hp = 250;
    private String[] moves = {"あわ","体当たり","鉄壁","水の波動"};
    private String[] details = {"水タイプの技","ノーマルタイプの技","自分の防御力を高める","水タイプの技"};
    private int[] moveDamage = {80, 50, 0, 80};

    Enemy(String name){
        this.name = name;
        this.moveInfo();
    }

    public void moveInfo(){
        System.out.println("相手のポケモンは："+ this.name);
        for(int i=0;i < moves.length;i++){
            System.out.println("["+i+"]"+ " " + moves[i]+ "：" + details[i] + " " +"威力：" + moveDamage[i]);
        }
    }

    public void setHp(int damage){
        this.hp -= damage;
        System.out.println("ゼニガメは"+ damage + "のダメージを食らった");
        System.out.println("ゼニガメの残りHPは" + this.getHp() + "です");
    }

    public int getHp(){
        if(this.hp >= 0){
            return this.hp;
        }else{
            return 0;
        }
    }

    public int enemyMove(){
        Random rand = new Random();
        int num = rand.nextInt(3);
        return this.moveDamage[num];
    }

}