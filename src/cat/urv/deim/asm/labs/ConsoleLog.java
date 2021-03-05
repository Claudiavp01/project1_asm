package cat.urv.deim.asm.labs;

import java.util.Date;

public class ConsoleLog {



    public static void e(String tag, String message){
        System.out.println("\033[31m" + fecha() + " (E) " + tag + ": " + message );
    }
    public static void w(String tag, String message){
        System.out.println("\033[33m" + fecha() + " (W) " + tag + ": " + message );
    }
    public static void d(String tag, String message){
        System.out.println("\u001B[36m" + fecha() + " (D) " + tag + ": " + message );
    }
    public static void i(String tag, String message){
        System.out.println("\033[35m" + fecha() + " (I) " + tag + ": " + message);
    }
    public static void v(String tag, String message){
        System.out.println("\033[30m" + fecha() + " (V) " + tag + ": " + message);
    }

    public static String fecha(){
        java.util.Date aux = new Date();
        return aux.toString();
    }
}
