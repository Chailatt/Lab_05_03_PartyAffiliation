public class Main {
    public static void main(String[] args) {
        System.out.println("Enter party affiliation");
        String user1 = "I";

        if (user1.equals("D"))
            System.out.println("You get a Democrat Donkey! ");
        else if(user1.equals("R")) {
           System.out.println("You get a Republican Elephant! ");
        } else if (user1.equals("I")) {
            System.out.println("You get a man!");
        }

    }
}