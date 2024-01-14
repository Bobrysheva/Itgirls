package IOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ios {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("test1");
        File file2 = new File("test2");

        Scanner cs = new Scanner(file1);
        String text = cs.nextLine();

        PrintWriter pw = new PrintWriter(file2);
        pw.write(text);

        pw.close();

    }

}
