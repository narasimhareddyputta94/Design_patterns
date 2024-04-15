package Prototype_Design_Pattern;

public class IntelligentStudent extends Student{
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    private int iq;

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }


    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    public IntelligentStudent() {

    }



}
