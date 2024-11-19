class Student extends Person { 
    protected String myIdNum; // Student Id Number 
    protected double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public void setGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    public String toString() {
        return "id number: " + myIdNum + ", gpa: " + myGPA + " " + super.toString();
    }
}