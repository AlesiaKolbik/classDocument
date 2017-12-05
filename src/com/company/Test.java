package com.company;

public class Test {
    public static void main(String[] args) {
        Pdf pdf = new Pdf("report");
        Txt txt = new Txt();
        Document doc=new Txt();
        Document doc2=new Pdf("report2");

        pdf.generate();
        txt.generate();
        doc.generate();
        doc2.generate();

        download(pdf);
        download(txt);
        download(doc);
        download(doc2);



    }
    public static void download(Document document) {
        System.out.println("Document is download.");
    }
}
