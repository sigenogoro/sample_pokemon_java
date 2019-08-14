
class PokemonInfo{
    private String name;

    PokemonInfo(String name){
        this.name = name;
    }

    public void moveInfo(String[] moves, String[] details, int[] moveDamage){
        for(int i=0;i < moves.length;i++){
            System.out.println("["+i+"]"+ " " + moves[i] + "：" + details[i] + " " +"威力：" + moveDamage[i]);
        }
    }

    public int getHp(int hp){
        if(hp >= 0){
            return hp;
        }else{
            return 0;
        }
    }

    public int decisionMove(int moveNumber, int[] moveDamage){
        return moveDamage[moveNumber];
    }

    

    
}