public class OOPSBannerApp {

    public static void main(String[] args) {

        // If no names are provided
        if (args.length == 0) {
            System.out.println("Hello World");
        } 
        else {

            // Loop through all command line arguments
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i]);
            }

        }
    }

}