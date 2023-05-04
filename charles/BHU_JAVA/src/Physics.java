public class Physics {

        private float gravity = 10f;
        float mutiply(float num1, float num2){
            return num1 * num2;
        }

        public float getGravity() {
            return gravity;
        }

        public void setGravity(float gravity) {
            this.gravity = gravity;
        }

        float divide(float num1, float num2){
            return num1 / num2;
        }

        float powTwo(float num1){
            return num1 * num1;
        }
        float sub(float fv, float iv, float time){
            return fv - iv/time;
        }
    }


