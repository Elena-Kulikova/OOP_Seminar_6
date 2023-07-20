 /**
     * Класс документ - описывает документ.
     *
     * Нужно спроектировать подсистему отчетов, которая будет формировать отчеты для документа.
     * document -> report
     * 1. Формирование PDF-файла (потенциально может быть несколько видов разметки этого PDF-файла).
     * 2. Создание JSON-файла с полями документа
     * 3. Создание XML-файла с полями документа
     * 4. ... потенциально отчеты могут добавляться.
     *
     * После реализации задать себе 2 вопроса:
     * 1. Насколько сложно добавить поддержку нового типа отчета?
     * 2. Как будет выглядеть проект, если типов отчетов будет 1000+?
     */
  public class Homework {
    public static void main(String[] args) {

        Document doc = new Document("6891", "document");
        CreateJSON converJSON = new CreateJSON();
        CreateHTML convertHTML = new CreateHTML();
        CreatePDF converPDF = new CreatePDF();

        Report reportJSON = new ReportEntrypoint().create(doc, converJSON);
        Report reportHTML = new ReportEntrypoint().create(doc, convertHTML);
        Report reportPDF = new ReportEntrypoint().create(doc, converPDF);

        System.out.println(reportJSON);
        System.out.println(reportHTML);
        System.out.println(reportPDF);
    }
}