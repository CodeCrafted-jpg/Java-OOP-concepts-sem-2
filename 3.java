class WelcomeStudent {
    public static void main(String[] args) {

        // Check if both name and surname are provided
        if (args.length < 2) {
            System.out.println("Please enter name and surname");
            return;
        }

        String name = args[0];
        String surname = args[1];

        System.out.println("Welcome " + name + " " + surname + "!");
    }
}