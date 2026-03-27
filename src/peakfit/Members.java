/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peakfit;

/**Memebers page that could be used in future updates such as user profiles
 * currently only name is used for a welcome message on homeGUI
 * Members.java
 * @author  Jaehyuk Lim – 23271329,
 */
public class Members {
    
    private String name;
    private String DOB;
    private String memberType;
    
    

    public Members(String name, String DOB, String memberType){
        this.name= name;
        this.DOB= DOB;//date of birth
        this.memberType= memberType;//membership type
    }
    

    public void setName(String name){
        this.name = name;
    }
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }
    
    
    public String getName(){
        return name;
    }
    public String getDOB(){
        return DOB;
    }
    public String getMemberType(){
        return memberType;
    }
}
