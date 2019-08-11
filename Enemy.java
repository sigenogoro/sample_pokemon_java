class Enemy{
    private String name;
    private int hp = 250;
    private String[] moves = {"あわ","体当たり","鉄壁","水の波動"};

    Enemy(String name){
        this.name = name;
        this.moveInfo();
    }

    public void moveInfo(){
        System.out.println("相手のポケモンは："+ this.name);
        for (String move:this.moves){
            System.out.println(move);
        }
    }

    public int getHp(){
        return this.hp;
    }
}