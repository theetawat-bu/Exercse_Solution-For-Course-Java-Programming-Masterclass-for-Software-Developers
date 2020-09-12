public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }

    public static boolean hasTeen(int t1,int t2,int t3){
        if(t1>=13 && t1<=19 || t2>=13 && t2<=19 || t3>=13 && t3<=19  )
            return true;
        return false;
    }

    public static boolean isTeen(int t1){
        if(t1>=13 && t1<=19)
            return true;
        return false;
    }
}
