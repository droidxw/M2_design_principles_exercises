package solid.dependencyInversion;

public class BudgetReport implements Entity
{
    private Database database;

    public BudgetReport()
    {
        this.database = new MySQLDatabase();
//        this.database = new MongoDB();
        database.connect("projects");
    }

    public void save() {
        database.insert(this);
    }
}
