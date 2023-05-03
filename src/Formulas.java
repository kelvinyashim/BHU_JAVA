public class Formulas extends Physics {
     void accessGravity(){
        System.out.println(getGravity());
        setGravity(10f);
       // System.out.println(getGravity());

    }
    float mutiply(float num1, float num2) {
        return super.mutiply(num1, num2);
    }
    float Force(float m, float a){
       return mutiply(m,a);
    }
       float PEnergy(float m, float h){
         return mutiply(m,h * getGravity());
    }



}
