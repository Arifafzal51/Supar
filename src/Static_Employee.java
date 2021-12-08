class Static_Employee
 {
    int empid;
    String name;
    static String company="Ahmad";


//                 Memory Efficiency
        Static_Employee( int empid, String name)
        {
            this.empid = empid;
            this.name = name;

        }

    void display()
    {
        System.out.println(empid+" "+name+" "+company+" ");
    }

    public static void main(String[] args)
    {
        Static_Employee e1 = new Static_Employee(1002,"sam");
        e1.display();
        Static_Employee e2 = new Static_Employee(1003,"Arif");
        e2.display();

    }
}

