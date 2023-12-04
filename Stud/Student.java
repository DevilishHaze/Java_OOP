package Stud;

public  class Student {
    private String FirstName, LastName,group;
    double averageMark;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        FirstName = firstName;
        LastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Студент" +
                "\nИмя:" + FirstName +
                "\nФамилия:" + LastName +
                "\nГруппа:" + group  +
                "\nСредняя оценка:" + averageMark ;
    }

    public int getScolarship(){
         int Scholarship = 0;
        if (averageMark == 5.0){
            Scholarship = 5500;}
        else{
            Scholarship = 1500;
        }
        return Scholarship;
    }
}

