package Users;

public class UserExp extends User
{
    private double salary;
    private int experience;


    public int getExperience()
    {
        return experience;
    }
    public void setExperience(int experience)
    {
        this.experience = experience;
    }
    public double getSalary()
    {
        return Math.round (salaryIncrease ());
    }
    public void setSalary(double salary)
    {
        this.salary = salary;

    }

    private double salaryIncrease ()
    {

        if (experience < 2) {
            return salary = salary * 1.05;
        }
           else if (experience <= 5)
           {
               return salary = salary * 1.1;
           }
           else return salary = salary * 1.15;
    }
}



