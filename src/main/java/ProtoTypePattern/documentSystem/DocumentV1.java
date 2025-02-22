package ProtoTypePattern.documentSystem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentV1 implements Prototype {
    private String title;
    private String author;

    public DocumentV1(String title, String author){
        this.title = title;
        this.author = author;
    }

    public DocumentV1(DocumentV1 defaultDocumentV1){
        this.title = defaultDocumentV1.getTitle();
        this.author = defaultDocumentV1.getAuthor();
    }

    @Override
    public DocumentV1 clone(){
        return new DocumentV1(this);
    }
}
