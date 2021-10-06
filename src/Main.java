public class Main {
    public static void main(String[] args) throws CookBusyException {
numberOfPizza(2);




    }
    public static void numberOfPizza(int num) throws CookBusyException {
        if (num>1 ){
            throw new CookBusyException("Sorry our Cook is busy");
        }

    }
}
