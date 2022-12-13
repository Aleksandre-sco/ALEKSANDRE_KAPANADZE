public class Main {
    public static void main(String[] args) {


        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(2, 8);

        System.out.println("წილადები ტოლია" + "  -  " + f1.equals(f2));

        System.out.println("პირველი და მეორე წილადი შეკვეცის შემთხვევაში = " + Fraction.abbr(f1.getNumerator(),
                        f1.getDenominator()) + "; " + Fraction.abbr(f2.getNumerator(), f2.getDenominator()));


        Fraction ADD = f1.add(f2);
        System.out.println("წილადების ჯამი = " + ADD.toString());

        Fraction MULT = f1.mult(f2);
        System.out.println("წილადების ნამრავლი = " + MULT.toString());

    }
}