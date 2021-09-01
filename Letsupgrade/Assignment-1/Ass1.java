class Student{
    String name ;
    int roll;
    float marks;
    void display(){
        System.out.println("Student Name:" +name);
        System.out.println("Student Roll:" +roll);
        System.out.println("Student marks:" +marks);
    }
}

class Test{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Harsha";
        obj.roll = 100;
        obj.marks = 78;

        obj.display();
    }
}