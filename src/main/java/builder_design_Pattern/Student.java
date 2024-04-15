package builder_design_Pattern;

public class Student {

    private String name;
    private int rollNo;
    private String phoneNo;
    private String email;
    private String department;
    private String semester;
    private String university;

    private Student(Builder builder) {
        this.name = builder.getName();
        this.rollNo = builder.getRollNo();
        this.phoneNo = builder.getPhoneNo();
        this.email = builder.getEmail();
        this.department = builder.getDepartment().toString();
        this.semester = builder.getSemester().toString();
        this.university = builder.getUniversity().toString();
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private int rollNo;
        private String phoneNo;
        private String email;
        private Department department;
        private Semester semester;
        private University university;

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getRollNo () {
            return rollNo;
        }

        public void setRollNo ( int rollNo){
            this.rollNo = rollNo;
        }

        public String getPhoneNo () {
            return phoneNo;
        }

        public void setPhoneNo (String phoneNo){
            this.phoneNo = phoneNo;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public Department getDepartment () {
            return department;
        }

        public void setDepartment (Department department){
            this.department = department;
        }

        public Semester getSemester () {
            return semester;
        }

        public void setSemester (Semester semester){
            this.semester = semester;
        }

        public University getUniversity () {
            return university;
        }

        public void setUniversity (University university){
            this.university = university;
        }

        private void validate () {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            if (rollNo <= 0) {
                throw new IllegalArgumentException("Roll number cannot be less than or equal to zero");
            }
            if (phoneNo.length() != 10) {
                throw new IllegalArgumentException("Phone number should be of 10 digits");
            }
        }

        public Student build () throws IllegalArgumentException {
            try {
                validate();
                return new Student(this);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e.getMessage());
            }


        }

    }
}
