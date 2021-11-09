package solid.singleResponsability;

public class RefactorTestEmployee
{
    public static void main(String[] args) {
    	RefactorEmployee laura = new RefactorEmployee("Laura");
        TimeSheetReport timeSheetReport = new TimeSheetReport();
        timeSheetReport.print(laura);
    }
}