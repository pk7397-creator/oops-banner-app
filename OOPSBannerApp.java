public class OOPSBannerApp {

    public static void main(String[] args) {

        // If no arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
        }
        else {

            // Enhanced for loop to process names
            for (String name : args) {
                System.out.println("Hello " + name);
            }

        }

    }

}