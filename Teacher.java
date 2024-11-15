public class Teacher{
    public String name;
    public String reason;
    public String favName;
    public String favReas;
    
    public Teacher(String name, String reason){
        this.name = name;
        favName = name;
        this.reason = reason;
        favReas = reason;
        
    }
    //A constructor for a new teacher object
    public void setName(String name){
        this.name = name;
    }
    //Sets the name of the teacher
    public void setReason(String reason){
        this.reason = reason;
    }
    
    //Sets the reason for the teacher
    public String getName(){
        if(name.equals(favName)){
            return name;
        }else{
            return favName;
        }
        
        
    }
    //Returns the name of the teacher
    public String getReason(){
        if(reason.equals(favReas)){
            return reason;
        }else{
            return favReas;
        }
    }
    

}