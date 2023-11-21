class person{
    String name = new String();
    void display1(){
        System.out.println("Name is : " + name);
    }
}
class teacher extends person{
    int id;
    void display2(){
        display1();
        System.out.println("Id is : " + id);
    }
}
class student extends teacher{
    int roll;
    void display3(){
        display2();
        System.out.println("Roll is : " + roll);
    }
}

public class multilevel_inheri {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Mohsin";
        s1.roll = 664900;
        s1.id = 121;
        s1.display3();
    }
}
