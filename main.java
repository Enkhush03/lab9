public class main {



class Person{
    private String Name;
    private String SSNum;
    private int age;
    
    public String getName();
    public String getSSNum();
    public int getAge();
    void setName(String );
    void setSSNum();
    void setAge();

    
}

class Spouse{
    private Date Anniversary;
    public Date getAnniversary();
    void getAnniversary(Date Anniversary);

}
class Employee{
    private String CompanyID;
    private String Title;
    private Date StartDate;
    public String getCompanyID();
    public String getTitle();
    public Date getStartDate();
    void setCompanyID(String CompanyID);
    void setTitle(String Title);
    void setStartDate(Date StartDate);

}
class Child{
    private String FavoriteToy;
    public String getFavoriteToy();
    void setFavoriteToy(String FavoriteToy);




}
class Division{
    private String DivisionName;
    public String getDivisionName();
    void setDivisionName(String DivisionName);

}
class JobDescription{
    private String Description;
    public String getDescription();
    void setDescription(String Description);

}
}