import java.io.FileInputStream;

public class ReadSingleChar{
    public static void main(String[] args) {
        try {
            FileInputStream fin=new FileInputStream("test.txt");
            int singleChar=fin.read();
            System.out.println((char)singleChar);
            fin.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
