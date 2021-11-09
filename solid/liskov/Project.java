package solid.liskov;

import java.util.ArrayList;

public class Project
{
    private ArrayList<Document> documents;
    private ArrayList<WritableDocument> writableDocuments;

    public Project()
    {
        this.documents = new ArrayList<>();
        this.writableDocuments = new ArrayList<>();
    }

    public void openAll() {
        for(Document doc: documents) {
            doc.open();
        }
    }

    public void saveAll() {

        for(WritableDocument doc: writableDocuments) {
           doc.save();
        }
    }

    public void addDocument(Document document) {
        documents.add(document);

        if (document instanceof WritableDocument) {
            writableDocuments.add((WritableDocument) document);
        }
    }
}