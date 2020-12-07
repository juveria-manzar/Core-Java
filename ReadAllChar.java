import java.io.FileInputStream;

public abstract class ReadAllChar {
    public static void main(String[] args) {
        try {
            FileInputStream fin=new FileInputStream("test.txt");
            int singleChar=0;
            while((singleChar=fin.read())!=-1){
                System.out.print((char)singleChar);
            }
            fin.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
