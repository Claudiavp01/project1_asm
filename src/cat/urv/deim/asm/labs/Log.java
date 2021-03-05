package cat.urv.deim.asm.labs;

import java.util.Date;

public class Log extends  ConsoleLog {


public  Log(){}

    public void error(String tag, String message){
        System.out.println("\033[31m" + fecha() + " (E) " + tag + ": " + message);
    }

    public void warning(String tag, String message){
        System.out.println( "\033[33m" + fecha() + " (W) " + tag + ": " + message );
    }

    public void debug(String tag, String message){
        System.out.println("\u001B[36m" + fecha() + " (D) " + tag + ": " + message);
    }
    public void info(String tag, String message){
        System.out.println("\033[35m" + fecha() + " (I) " + tag + ": " + message);
    }

    public void verbose(String tag, String message){
        System.out.println("\033[30m" + fecha() + " (V) " + tag + ": " + message);
    }


}
