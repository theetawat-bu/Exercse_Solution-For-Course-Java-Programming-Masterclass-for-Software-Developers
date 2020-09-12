public class Main {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0)
            System.out.println("Invalid Value");
        else{
            long year,day;
            year=(minutes/(60*24))/365;
            day=(minutes/(60*24))%365;
            String format = minutes+" min = "+year+" y and "+day+" d";
            System.out.println(format);
        }
    }
}
