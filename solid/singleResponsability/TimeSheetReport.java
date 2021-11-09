package solid.singleResponsability;

public class TimeSheetReport
{
    public void print(RefactorEmployee employee) {
        System.out.println("Time sheet of " + employee.getName());
        System.out.println("Hours worked: ...");
        System.out.println("Holidays: ...");
        System.out.println("Days off: ...");
    }
}