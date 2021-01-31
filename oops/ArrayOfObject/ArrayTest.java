public class ArrayTest {
    public String name;
    public int releaseYear;
    public String director;

    public ArrayTest(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
       return
            this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
    public static void main(String[] args) {
        ArrayTest[] dvdCollection = new ArrayTest[15];
        dvdCollection[0]=new ArrayTest("3 Idiots",2008,"Rajkumar Hirani");
        System.out.println(dvdCollection[0]);
    }
}