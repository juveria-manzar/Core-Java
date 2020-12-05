import java.io.FileOutputStream;

public class WriteStringTest {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("test.txt");
            String s="Lets understand File Handling";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
