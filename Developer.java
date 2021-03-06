/**
 * Author: Saugat Adhikari
 * 
 */
// Creating the parent class Developer

public class Developer
{
    //Declaring attributes//
    private String platform;
    private String interviewerName;
    public String developerName;
    private int workingHours;
    
    /*Making a parameterized constructor that initializes platform, interviewerName and workingHours by assigning their 
     *corresponding values into the paramater 
     */
    public Developer(String platform, String interviewerName, int workingHours)
    {
        this.platform = platform;
        this.interviewerName = interviewerName;
        this.workingHours = workingHours;
        this.developerName = "";
        
    }
    
    /*This is a accessor method for accessing the value of 
     * attribute (platform) which returns String value. 
     */
    
    public String getPlatform()
    {
        return this.platform;
    }
    
     /*This is a accessor method for accessing the value of 
     * attribute(interviewer) which returns String value.
     */
    public String getInterviewer()
    {
        return this.interviewerName;
    }
    
     /*This is a accessor method for accessing the value of 
     * attribute(interviewer) which returns String value.
     */
    public int getHours()
    {
        return this.workingHours;
    }
    
    /*This is a accessor method for accessing the value of 
       attribute(developerName) which returns String value. 
     */
    public String getDeveloper()
    {
        return this.developerName;
    }
    
    /*This is a setter method that sets the value of 
     * attribute(platform) into a new variable (platform), 
     * which is passed into the parameter. 
     */
    public void setPlatform(String platform)
    {
         this.platform = platform;   
    }
    
    /* This is a setter method that sets the vaue of attribute (interviewerName)
     * into a new variable interviewerName, which is passed through
     * the parameter.
     */
    public void setInterviewer(String interviewerName)
    {
       this.interviewerName = interviewerName;  
    }
    
    /*This is a setter method that sets the value of attribute(workingHours)  into a 
     * new variable(workingHours), which is passed into the parameter.  
     */
    public void setHours(int workingHours)
    {
         this.workingHours = workingHours;
        
    }
    
    /*This is a setter method that sets the value of attribute (developerName) into a new variable (develpoperName),
     * which is passed into the parameter. 
     */
    public void setDeveloper(String developerName)
    {
        this.developerName = developerName;
    }
    
    /*This is void method for printing the platform, wokringHours, 
     * interviewerName and developerName according to the condition.    
     */
    
    public void display()
    {
        System.out.println("The developer is required for below platform:" + platform);
        System.out.println("The name of the interviewer is:" +interviewerName);
        System.out.println("The weekly working hours per day for a developer is:" + workingHours);
        if (developerName != "")
        {
            System.out.println("The name of the developer is:" + developerName);
        }
        else
        {
            System.out.println("Developer name not assigned.");
        }
            
    }
  
}