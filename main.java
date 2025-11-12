import java.util.Date;
public class main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

class Person{
    private String Name;
    private String SSNum;
    private int Age;
    
    public String getName(){
        return Name;
    }
    public String getSSNum(){
        return SSNum;
    }
    public int getAge(){
        return Age;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setSSNum(String SSNum){
        this.SSNum = SSNum;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
}

class Spouse extends Person{
    private Date AnniversaryDate;
    public Date getAnniversary(){
        return AnniversaryDate;
    }
    public void setAnniversary(Date Anniversary){
        this.AnniversaryDate = Anniversary;
    }
}
class Employee{
    private String CompanyID;
    private String Title;
    private Date StartDate;
    public String getCompanyID(){
        return CompanyID;
    }
    public String getTitle(){
        return Title;
    }
    public Date getStartDate(){
        return StartDate;
    }
    public void setCompanyID(String CompanyID){
        this.CompanyID = CompanyID;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }
    public void setStartDate(Date StartDate){
        this.StartDate = StartDate;
    }
}
class Child{
    private String FavoriteToy;
    public String getFavoriteToy(){
        return FavoriteToy;
    }
    public void setFavoriteToy(String FavoriteToy){
        this.FavoriteToy = FavoriteToy;
    }
}
class Division{
    private String DivisionName;
    public String getDivisionName(){
        return DivisionName;
    }
    public void setDivisionName(String DivisionName){
        this.DivisionName = DivisionName;
    }
}
class JobDescription{
    private String Description;
    public String getDescription(){
        return Description;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }
}