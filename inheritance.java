class person{
    int id;
    void display1(){
        System.out.println("Id is : " + id);
    }
}
class student extends person{
    String name = new String();
    int roll;
    void display2(){
        System.out.println("Name is : " + name);
        System.out.println("Roll Is : " + roll);
        display1();
    }
}
public class inheritance{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Mohsin";
        s1.roll = 664900;
        s1.id = 123;
        s1.display2();
    }
}
