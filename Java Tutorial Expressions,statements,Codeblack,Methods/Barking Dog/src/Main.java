public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(false,-1));
    }

    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23)
            return false;
        if(barking){
            if(hourOfDay<8 || hourOfDay>22)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
