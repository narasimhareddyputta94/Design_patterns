package builder_design_Pattern;

public class Client {
    public static void main(String[] args) {


//        // Idea 1
//        Builder builder = new Builder();
//        builder.setName("John Doe");
//        builder.setRollNo(123456);
//        builder.setPhoneNo("1234567890");
//        builder.setEmail("narasimha@123");
//        builder.setDepartment(Department.CSE);
//        builder.setSemester(Semester.FIRST);
//        builder.setUniversity(University.JNTU);
//
//
//
//        // Idea 2
//
//        Builder builder1 = Student.createBuiler();
//        builder1.setName("John Doe");
//        builder1.setRollNo(123456);
//        builder1.setPhoneNo("123456780");
//        builder1.setEmail("narasimha@123");
//        builder1.setDepartment(Department.CSE);
//        builder1.setSemester(Semester.FIRST);
//        builder1.setUniversity(University.JNTU);
//
//        Student student1 = builder1.build();
////        Student student2 = new Student(builder1);


        // Idea 3
        Student student = Student.createBuilder()
                .setName("John Doe")
                .setRollNo(123456)
                .setPhoneNo("1234567890")
                .setEmail("narasimha@123")
                .setDepartment(Department.CSE)
                .setSemester(Semester.FIRST)
                .setUniversity(University.JNTU)
                .build();

        System.out.println("DEBUG: " + student.toString());




    }
}
