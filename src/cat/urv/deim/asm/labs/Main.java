package cat.urv.deim.asm.labs;


public class Main {

    public static void main(String[] args) {
	//code

        Log.e("TAG", "missatge estàtic de tipus error");
        Log.w("TAG", "missatge estàtic de tipus  warning");
        Log.d("TAG", "missatge estàtic de tipus debug");
        Log.i("TAG", "missatge estàtic de tipus info");
        Log.v("TAG", "missatge estàtic de tipus verbose");

        Log log = new Log();

        log.error("TAG", "missatge mitjançant Log instanciat de tipus error");
        log.warning("TAG", "missatge mitjançant Log instanciat de tipus warning");
        log.debug("TAG", "missatge mitjançant Log instanciat de tipus debug");
        log.info("TAG", "missatge mitjançant Log instanciat de tipus info");
        log.verbose("TAG", "missatge mitjançant Log instanciat de tipus verbose");
    }
}


