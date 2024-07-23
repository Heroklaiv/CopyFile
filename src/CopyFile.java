import java.io.*;


public class CopyFile {
private String newNameFile;

    public void copy(String str) {
        File file = new File(str);
        if (file.isFile()) {
            long size = file.length();
            String newNameFile;
            newNameFile = "CopyFile_" + str;
            this.newNameFile = newNameFile;
            File file2 = new File(newNameFile);
            try (FileInputStream input = new FileInputStream(file);
                 FileOutputStream output = new FileOutputStream(file2)) {
                if (Integer.MAX_VALUE < size) {
                    System.out.println("размер файла превышает диапазон Integer");
                    return;
                }
                //List<Integer> list = new ArrayList<>();
                byte[] buffer = new byte[(int) size];
                while (input.available() > 0) {
                    int real = input.read(buffer);
                    output.write(buffer, 0, real);
                }
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла");
            }
        } else {
            System.out.println("Не является файлом");
        }
        if (file.isDirectory()) {
            System.out.println("Текущий путь: " + str);
            SearchFile searchFile = new SearchFile();
            searchFile.writeDirectory(str);
            str = searchFile.searchYouFile(str);
            System.out.println(str);
        }

    }
    public  boolean inspectResultFileCopy(String a) {
        File file = new File(a);
        File file2 = new File(newNameFile);
        if (file.length() == file2.length()) {
            return true;
        } else return false;
    }

}
