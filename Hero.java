class Hero{
    private String name;
    private int hp = 200;
    private String[] moves = {"10万ボルト","アイアンテール", "しっぽをふる", "カミナリ"};
    private String[] details = {"電気タイプの技","ノーマルタイプの技","相手の防御力を落とす","電気タイプの技"};
    private int[] moveDamage = {80, 50, 0, 80};

    Hero(String name){
        this.name = name;
        this.moveInfo();
    }

    public void moveInfo(){
        for(int i=0;i < moves.length;i++){
            System.out.println("["+i+"]"+ " " + moves[i]+ "：" + details[i] + " " +"威力：" + moveDamage[i]);
        }
    }

    public int getHp(){
        if(this.hp >= 0){
            return this.hp;
        }else{
            return 0;
        }
    }

    public void setHp(int damage){
        this.hp -= damage;
        System.out.println("ピカチュウは"+ damage + "のダメージを食らった");
        System.out.println("ピカチュウの残りHPは" + this.getHp() + "です");
    }


    public int decisionMove(int moveNumber){
        return this.moveDamage[moveNumber];
    }


}