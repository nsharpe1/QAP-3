class CollegeStudent extends Student{
    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }

    public int getYear() {
        return myYear;
    }

    public String getMajor() {
        return myMajor;
    }

    public void setYear(int myYear) {
        this.myYear = myYear;
    }

    public void setMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    public String toString() {
        return "major: " + myMajor + ", year: " + myYear + " " + super.toString();
    }
}
