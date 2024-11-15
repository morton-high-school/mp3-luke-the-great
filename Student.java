public class Student{
    
    public String name;
    public int id;
    public double gpa;
    public Teacher favorite;
    public static int count;
    public int numGrades = 0;
    public double grade;
    public String teach;
    public String teachr;
    
    public Teacher trueFavorite;

    public Student(String name){
        this.name = name;
        id = count;
        count++;
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
        numGrades++;
        grade = grade + Grade;
        gpa = grade/numGrades;
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
