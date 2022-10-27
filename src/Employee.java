import java.util.Comparator;

public class Employee{
    private String empName;
    private String empAddress;
    private Integer empID;

    public Employee() {
    }

    public Employee(String empName, String empAddress, int empID) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }





    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empID=" + empID +
                '}';
    }
}
