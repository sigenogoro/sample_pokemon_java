class Hero extends PokemonInfo{

    protected int hp = 200;
    public String[] moves = {"10万ボルト","アイアンテール", "しっぽをふる", "カミナリ"};
    protected String[] details = {"電気タイプの技","ノーマルタイプの技","相手の防御力を落とす","電気タイプの技"};
    protected int[] moveDamage = {80, 50, 0, 80};
    protected int defensePower = 40;

    Hero(String name){
        super(name);
    }

    public String[] getMove(){
        return this.moves;
    }

    public String[] getDetalis(){
        return this.details;
    }

    public int[] getMoveDamage(){
        return this.moveDamage;
    }

    public void setHp(int damage){
        if(damage == 0){
            System.out.println("ゼニガメの防御力を10上がった！");
        }else{
            this.hp -= (damage - defensePower);
            System.out.println("ピカチュウは"+ damage + "のダメージを食らった");
        }
        System.out.println("ピカチュウの残りHPは" + this.hp + "です");
    }




}