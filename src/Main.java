
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CopyFile work = new CopyFile();
        Scanner scan = new Scanner(System.in);
        //String str = scan.nextLine();
        String str = "test.txt";
        work.copy(str);
        System.out.println(work.inspectResultFileCopy(str));
    }
}