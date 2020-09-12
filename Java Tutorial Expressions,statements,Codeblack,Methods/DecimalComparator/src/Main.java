public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3,3));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1,double number2){
        int cutToThreeDecimal_number1 =(int)(number1*1000);
        int cutToThreeDecimal_number2 = (int)(number2*1000);
        if(cutToThreeDecimal_number1==cutToThreeDecimal_number2)
            return true;
        else
            return false;

    }
}
