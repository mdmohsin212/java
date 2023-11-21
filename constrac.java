class student{
    String name = new String();
    int roll;
    int id;
    student(String s, int r, int i){
        name = s;
        roll = r;
        id = i;
    }
    void display(){
        System.out.println("Name is : " + name);
        System.out.println("Roll is : " + roll);
        System.out.println("Id is : " + id);
    }
}
public class constrac {
    public static void main(String[] args) {
        student s1 = new student("Mohsin", 664900, 121);
        s1.display();
    }
}