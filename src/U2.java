public class U2 extends Rocket{
    int carry, carryLimit;
    public boolean launch() {
        double chance = 4.0 * (carry / carryLimit);
        if((Math.random()*100)<=chance) {
            return false;
        }else {
            return true;
        }

    }
    public boolean land(){
        double chance = 8.0 * (carry / carryLimit);
        if((Math.random()*100)<=chance) {
            return false;
        }else {
            return true;
        }
    }
}
