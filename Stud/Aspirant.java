package Stud;

public class Aspirant extends Student{
    private String ScientificProject ;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificProject) {
        super(firstName, lastName, group, averageMark);
        ScientificProject = scientificProject;
    }

    @Override
    public String toString() {
        return "Аспирант-"+super.toString()+
                "\nНаучная работа: " + ScientificProject;
    }

    @Override
    public int getScolarship() {
        int Scholarship = 0;
        if (averageMark == 5.0){
            Scholarship = 10000;}
        else{
            Scholarship = 5500;
        }
        return Scholarship;
    }
}
