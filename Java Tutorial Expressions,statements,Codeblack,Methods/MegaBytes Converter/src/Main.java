public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int MegaBytes = kiloBytes/1024;
        int remainKB = kiloBytes%1024;
        if(kiloBytes<0)
            System.out.println("Invalid Value");
        else {
            String format = kiloBytes+" KB = "+MegaBytes +" MB and "+ remainKB +" KB";
            System.out.println(format);

            }
    }
}
