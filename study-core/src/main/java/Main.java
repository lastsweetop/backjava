import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/27
 * Time: 下午5:36
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()){
            String str=in.nextLine();
            String[] strings=str.split(" ");
            for (int i = strings.length-1; i >-1 ; i--) {
                System.out.print(strings[i]);
                if (i>0){
                    System.out.print(" ");
                }
            }
        }
    }
    
}
