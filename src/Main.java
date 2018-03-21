import java.io.File;
import java.util.Scanner;

public class Main {
    public static void searchTXT(String path) {
        File f1 = new File(path);
        if (f1.isDirectory()) {
            String s[] = f1.list();
            for (int i=0; i < s.length; i++) {
                File f = new File(path + "\\" + s[i]);
                if (f.isDirectory()) {
                    searchTXT(f.getAbsolutePath());
                } else {
                    if(f.getName().endsWith(".txt")) {
                        System.out.println(f.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println(path + " is not a directory");
        }
    }

    public static void main(String[] args) {
        String dirname;
        /*if(args.length !=0) {
            dirname = args[0];
        } else {
            dirname = "E:\\Books\\Programming";
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the path: ");
        dirname = scanner.nextLine();
        System.out.println("txt-files:");
        searchTXT(dirname);
    }
}