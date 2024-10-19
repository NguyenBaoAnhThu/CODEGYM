//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double a = 16;

        double b = 4;

        if(a-b>13){

            System.out.println(a-b);

        } else if(b-- > 3){

            System.out.println(b);

        } else (a+b > 16) {

            System.out.println(a+b);
        }
    }
}