package Polymorphism;

import Polymorphism.Document;
import Polymorphism.DocumentProcessor;
import Polymorphism.PDFDocumentProcessor;
import Polymorphism.PDFDocument;


public class Covariant_RT {
    public static void main(String[] args) {
        DocumentProcessor processor = new PDFDocumentProcessor();
        Document doc = processor.processDocument();

        doc.printInfo();

        if (doc instanceof PDFDocument) {
            ((PDFDocument) doc).extractMetadata();
        }
    }
}
