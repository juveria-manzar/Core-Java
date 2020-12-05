import java.io.FileOutputStream;

public class WriteByteTest{
    public static void main(String... s) {
        try{
            FileOutputStream fout=new FileOutputStream("test.txt");
            fout.write(65);//writing a byte
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}