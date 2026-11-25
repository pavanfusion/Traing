public class HelloWorld {
    public static void main(String[] args){
        int x = 5;
        System.out.println("\"Welcome to Java Learning\"");
        System.out.println("I pledge to 'WORK HARD'; to become \"PROFICIENT\" at Programming!");
        System.out.append("I want to be\nTHE BEST CODER!");
        if(x > 5){
            System.out.println("Positive Number");

        }
        else if( x< 0 ){
            System.out.println("Negitive Number");
        }
        else {
            System.out.println("Zero Number");
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("i: " + i);
        }
    }
}
