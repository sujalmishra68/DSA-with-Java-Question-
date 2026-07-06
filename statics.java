class Students {
   static  String name="sujal";
    static void hello() {

        System.out.println("Hello Students, "+name);

    }
}

public class statics {
    public static void main(String[] args) {
//
//    students s= new students();
//        System.out.println(s.college);
        Students.hello();
    }
}
