public class fracMultiply {

    public static void main(String[] args) {
        frac f1 = new frac(1,4);
        frac f2 = new frac(1,4);

        frac result = f1.multiply(f2);  //f1 is calling the multiply method and f2 is the argument
        result.display();
    }

    public static class frac {
        int num, den;

        public frac(int num, int den) {
            this.num = num;
            this.den = den;
        }

        public frac multiply(frac other) {
            int newNum = this.num * other.num;  //here this.num is f1 and other.num is f2
            int newDen = this.den * other.den;
            return new frac(newNum, newDen);
        }

        public void display() {
            System.out.println(num + "/" + den);
        }
    }
}
