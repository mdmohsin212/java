class student{
    void add(int a, int b){
        System.out.println(a + b);
    }
    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    void add(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }
    void add(){
        System.out.println("Nothing to add");
    }
}

public class method_overloading {

    public static void main(String[] args) {
        student s1 = new student();
        s1.add(12,18);
        s1.add(10,20,45);
        s1.add(10,20,30,40);
        s1.add();
    }
}