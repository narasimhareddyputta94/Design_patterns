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

        public Builder setName (String name){
            this.name = name;
            return this;
        }

        public int getRollNo () {
            return rollNo;
        }

        public Builder setRollNo ( int rollNo){
            this.rollNo = rollNo;
            return this;
        }

        public String getPhoneNo () {
            return phoneNo;
        }

        public Builder setPhoneNo (String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }

        public String getEmail () {
            return email;
        }

        public Builder setEmail (String email){
            this.email = email;
            return this;
        }

        public Department getDepartment () {
            return department;
        }

        public Builder setDepartment (Department department){
            this.department = department;
            return this;
        }

        public Semester getSemester () {
            return semester;
        }

        public Builder setSemester (Semester semester){
            this.semester = semester;
            return this;
        }

        public University getUniversity () {
            return university;
        }

        public Builder setUniversity (University university){
            this.university = university;
            return this;
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
