class Hero{
    private String name;
    private int hp = 200;
    private String[] moves = {"10万ボルト","アイアンテール", "しっぽをふる", "カミナリ"};

    Hero(String name){
        this.name = name;
        this.moveInfo();
    }

    public void moveInfo(){
        for(int i=0;i < moves.length;i++){
            System.out.println("["+i+"]"+ " " + moves[i]);
        }
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int damage){
        this.hp -= damage;
        System.out.println("ピカチュウは"+ damage + "のダメージを食らった");
    }


    public int decisionMove(int moveNumber){
        return 100;
    }

}