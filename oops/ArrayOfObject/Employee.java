public class Employee {
    public int empId;
    public String empName;
    public String designation;

    Employee(int empId, String empName, String designation ){
        this.empId=empId;
        this.empName=empName;
        this.designation=designation;
    }

    public String toString(){
        return this.empId+ ",name is " + this.empName + ", posted as " + this.designation;
    }

    public static void main(String[] args) {

        Employee e1=new Employee(100,"John Sajo","Software Developer");
        Employee e2=new Employee(101,"Alex","Software Developer");
        Employee e3=new Employee(102,"Mark","Software Developer");

        //employees is an array of reference
        Employee[] employees=new Employee[3];
        
        // //Employee() is an object stored in refernce employees[0]
        // employees[0]=new Employee(100,"John Sajo","Software Developer");

        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;

        for(Employee e:employees){
            System.out.println(e);
        }
    }
}
