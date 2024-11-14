public class Student{
    
    public static String name;
    public static int id;
    public static double gpa;
    public Teacher favorite;
    public static int count;

    public Student(String name){
        this.name = name;
        
    }
    //A constructor for a new student object
    public static void addStudents(int number){
        count = number + count;
    }
    //Increases the total number of students
    public static int getStudentCount(){
        return count;
    }
    //Returns the total number of students
    public String getName(){
        return name;
    }
    // Returns the name of the student
    public int getID(){
        return id;
    }
    // Returns the ID of the student
    public void addGrade(int Grade){
        gpa = Grade;
    }
    //Takes in a grade on a 1-4 scale and recalculates the GPA
    public double getGPA(){
        return gpa;
    }
    //Returns the GPA of the student
    public void setFavoriteTeacher(Teacher favorite){
        this.favorite = favorite;
    }
    //Sets the student's favorite teacher
    public Teacher getFavoriteTeacher(){
        return favorite;
    }
    //Returns a reference to the student's favorite teacher
}
