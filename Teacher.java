class Teacher extends Person {
    protected String mySubject;
    protected double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public void setSalary(double mySalary) {
        this.mySalary = mySalary;
    }

    public String toString() {
        return "subject: " + mySubject + ", salary: " + mySalary + " " + super.toString();
    }
}
