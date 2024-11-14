public class Teacher{
    public String name;
    public String reason;
    
    public Teacher(String name, String reason){
        this.name = name;
        this.reason = reason;
    }
    //A constructor for a new teacher object
    public String getName(){
        return name;
    }
    //Returns the name of the teacher
    public String getReason(){
        return reason;
    }
    //Returns the reason for the teacher
    public void setName(String name){
        this.name = name;
    }
    //Sets the name of the teacher
    public void setReason(String reason){
        this.reason = reason;
    }
    //Sets the reason for the teacher
}