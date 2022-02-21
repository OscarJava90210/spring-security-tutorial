package Service;

import Model.Document;


import java.util.ArrayList;
import java.util.Collections;

/* Класс для порядкового вывода информации на консоль*/
public class ServiceReport {
        public static String report(ArrayList<Document> documentsList) {
            String report = "ОТЧЁТ: \n";
            Document checkDocument;
            Collections.sort(documentsList);
            checkDocument = documentsList.get(0);
            report += "Автор - " + checkDocument.getAuthorOfDoc() + ":\n";
            for (Document document : documentsList) {
                if (!document.getAuthorOfDoc().equals(checkDocument.getAuthorOfDoc())) {
                    checkDocument = document;
                    report += "Автор - " + document.getAuthorOfDoc() + ":\n";
                }
                report += document.toString() + "\n";
            }
            return report;
        }
    }
