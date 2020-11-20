public class U2 extends Rocket{
    //int carry, carryLimit;

    public boolean launch() {
        double chance = 4.0 * (carry / carryLimit);         // random number to see if launch succesfull
        if((Math.random()*100)<=chance) {
            return false;
        }else {
            return true;
        }

    }
    public boolean land(){
        double chance = 8.0 * (carry / carryLimit);         // random number to see if landing succesfull
        if((Math.random()*100)<=chance) {
            return false;
        }else {
            return true;
        }
    }

    U2(){
        carry=0;                // rocket constructor
        carryLimit=11000;
        cost = 120;
    }
}
