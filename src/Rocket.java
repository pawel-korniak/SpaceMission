public class Rocket implements SpaceShip{
    int carry, carryLimit, cost;
    public boolean launch(){
        return true;
    }
    public boolean land(){
        return true;
    }
    public boolean canCarry(Item item){                     // check if rocket can carry item from parameter
        if((carry+item.weight)<=carryLimit){
            return true;
        } else {
            return false;
        }
    }
    public void carry(Item item){
        carry+= item.weight;
    }       // adding item weight to rocket's carried load

}
