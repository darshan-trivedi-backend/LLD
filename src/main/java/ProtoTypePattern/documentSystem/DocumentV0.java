package ProtoTypePattern.documentSystem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentVo {
    private String title;
    private String author;

    public DocumentVo(String title, String author){
        this.title = title;
        this.author = author;
    }
}

class ReportDocumentVo extends DocumentVo {
    public ReportDocumentVo(){
        super("Report", "Default Author");
        // Additional configuration for Report
    }
}

class InvoiceDocumentVo extends DocumentVo {

    public InvoiceDocumentVo(String title, String author) {
        super(title, author);
        // Additional configuration for Invoices
    }
}
