package solid.dependencyInversion;

public class MongoDBConnection
{
    private String database;

    public MongoDBConnection(String database)
    {
        this.database = database;
    }

    public String getDatabase()
    {
        return database;
    }

    public void setDatabase(String database)
    {
        this.database = database;
    }
}
