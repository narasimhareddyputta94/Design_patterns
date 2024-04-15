package Prototype_Design_Pattern;

public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private double psp;
    private String BatchName;

    private double AvgBatchpsp;




//    public Student clone(){
//        Student copy = new Student();
//        copy.setAge(this.age);
//        copy.setName(this.name);
//        copy.setPsp(this.psp);
//        copy.setBatchName(this.BatchName);
//        return copy;
//    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public double getPsp() {
//        return psp;
//    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

//    public String getBatchName() {
//        return BatchName;
//    }

    public void setBatchName(String batchName) {
        BatchName = batchName;
    }

//    public double getAvgBatchpsp() {
//        return AvgBatchpsp;
//    }

    public void setAvgBatchpsp(double avgBatchpsp) {
        AvgBatchpsp = avgBatchpsp;
    }

    public Student(Student student){
        this.age = student.age;
        this.name = student.name;
        this.psp = student.psp;
        this.BatchName = student.BatchName;
        this.AvgBatchpsp = student.AvgBatchpsp;
    }

    public Student(){

    }

    public Student clone(){
        return new Student(this);
    }



}
