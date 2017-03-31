/**
 * Created by User on 3/30/2017.
 */
public class Unit {

    public int ws;
    public int bs;
    public int s;
    public int t;
    public int w;
    public int i;
    public int a;
    public int ld;
    public int sv;

   public boolean rangedShot(int ballisticsSkill){

       boolean hit;
       int toHit = 7 - ballisticsSkill;
       if((Math. random() * 6 + 1) < toHit){
           hit = false;
       }else{
           hit = true;
       }

       return hit;

   }

   public boolean meleAttack(int attackerWS, int targetWS){

       boolean hit;
       int toHit;
       if (attackerWS == targetWS){
           toHit = 4;
       } else if (attackerWS == (targetWS +1)){
           toHit = 5;
       } else if (attackerWS > (targetWS +1)){

       }
       return hit;
   }


}
