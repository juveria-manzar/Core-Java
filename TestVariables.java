class TestVariables{  
    int data=50;//instance variable  
    static int m=100;//static variable  
    void method(){  
        int n=90;//local variable  
        System.out.println(n);
    }  
    public static void main(String... s) {
        TestVariables t = new TestVariables();
        System.out.println(t.data);
        System.out.println(TestVariables.m);
        t.method();
    }
}//end of class  