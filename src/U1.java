public class U1 extends Rocket {
    //int carry, carryLimit;
    public boolean launch() {
        double chance = 5.0 * (carry / carryLimit);
        if((Math.random()*100)<=chance) {
            return false;
        }else {
            return true;
        }

    }
    public boolean land(){
        double chance = 1.0 * (carry / carryLimit);
        if((Math.random()*100)<=chance) {
            return false;
        }else {
            return true;
        }
    }
    U1(){
        carry=0;
        carryLimit=8000;
    }
}
