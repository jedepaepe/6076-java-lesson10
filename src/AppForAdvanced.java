public class AppForAdvanced {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Veuillez introduire au moins 2 entiers");
            return;
        }
        long product = 1;
        //for (String arg : args) {
        //    product *= Integer.parseInt(arg);
        //}

        for (int i = 0; i < args.length; ++i) {
            product = product * Integer.parseInt(args[i]);
        }

        System.out.println(product);
    }
}
