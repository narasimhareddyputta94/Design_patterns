package Prototype_Design_Pattern;

public class Client {

    public static void fillRegistry(Stduentregistery stduentregistery){

        Student aprBeginerBatchPrototype = new Student();
        aprBeginerBatchPrototype.setBatchName("apr 23 beginer");
        aprBeginerBatchPrototype.setAvgBatchpsp(89);

        stduentregistery.register("aprBeginerBatch", aprBeginerBatchPrototype);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setAvgBatchpsp(99);
        intelligentStudent.setBatchName("Intelligent Batch");
        intelligentStudent.setIq(100);

        stduentregistery.register("IntelligentBatch", intelligentStudent);


    }
    public static void main(String[] args) {
        Stduentregistery stduentregistery = new Stduentregistery();
        fillRegistry(stduentregistery);

        Student dhaval = stduentregistery.get("aprBeginerBatch").clone();
        dhaval.setName("Dhaval");
        dhaval.setAge(23);
        dhaval.setPsp(90);



        Student ravi = stduentregistery.get("IntelligentBatch").clone();
        ravi.setName("Ravi");
        ravi.setAge(24);
        ravi.setPsp(88);


        System.out.print("DEBUG");





    }
}
