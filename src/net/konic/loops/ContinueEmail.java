package net.konic.loops;
public class ContinueEmail {
    public static void main(String[] args) {

        String emails[] = {"sahil@gmail.com", "abc", "ameen@yahoo.com"};

        for (String email : emails) {

            if (!email.contains("@")) {
                continue;   
            }

            System.out.println(email);
        }
    }
}
