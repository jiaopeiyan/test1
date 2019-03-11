import java.io.*;

public class testIO {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("e:\\test.txt");
            char[] buf = new char[1024];
            int len = 0;
            while ((len = fr.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.toString());
                }
            }
        }
    }
}

