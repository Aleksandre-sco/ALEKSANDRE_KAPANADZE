public class Fraction {

    private int numerator;
    private int denominator;


    @Override
    public boolean equals(Object obj) {


        if (obj instanceof Fraction) {

            if (numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator) {
                return true;
            }

        }
        return false;
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public String toString() {
        return numerator + "/" + denominator;

    }

    public Fraction add(Fraction other) {
        Fraction addFraction = new Fraction(((numerator * other.denominator) + (other.numerator * denominator)),
                (denominator * other.denominator));
        return addFraction;
    }

    public Fraction mult(Fraction other) {
        Fraction multFraction = new Fraction((numerator * other.numerator), (other.denominator * denominator));
        return multFraction;

    }

    static String abbr(int numerator, int denominator){

        int x = numerator;
        int y = denominator;

        while (x != 0 && y != 0){
            if(x > y) x %= y;
            else y &= x;

        }

        int a = x + y ;
        return numerator/a + "/" + denominator/a;


    }

}