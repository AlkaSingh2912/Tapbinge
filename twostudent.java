public class twostudent {
    int marks;
    String name;

    public static void main(String[] args) {
        twostudent stu1 = new twostudent();
        twostudent stu2 = new twostudent();
        stu1.marks = 21;
        stu1.name = "Alka";

        stu2.marks = 2;
        stu2.name = "Anshu";

        System.out.println(stu1.marks+" "+stu1.name);
        

        System.out.println(stu2.marks);
        System.out.println(stu2.name);
    }
}
