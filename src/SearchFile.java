import java.io.File;
import java.util.Scanner;

public class SearchFile {
    private String searcer() {

        return "";
    }

    public void writeDirectory(String str) {
        File file1 = new File(str);
        File folder = file1.getParentFile();
        file1 = new File(str);
        int numberLine = 0;
        for (File a : folder.listFiles()) {
            numberLine++;
            System.out.println(numberLine + ". " + a.getName());
        }
    }

    public String searchYouFile(String str) {
        System.out.println("Выберите файл: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        File file1 = new File(str);
        File folder = file1.getParentFile();
        file1 = new File(str);
        int numberLine = 0;
        for (File a : folder.listFiles()) {
            numberLine++;
            if (numberLine == number) {
                str = str + "\\" + a.getName();
            }

        }
        return str;
    }
}
