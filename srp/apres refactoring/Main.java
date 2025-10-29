public class Main {
    public static void main(String [] args){
        System.out.println("Creation du book...\n");
        BookSRP book = new BookSRP("Les Champions du francais", "tandandan", "Alphabet, Grammaire, Etude de texte");
        
        System.out.println("Sauvegarde du book...\n");
        BookSaver booksave = new BookSaver();
        booksave.saveToDatabase(book);
        booksave.saveToFile(book,"book_infos.txt");

        System.out.println("Affichage infos...\n");
        BookPrinter bookprint = new BookPrinter();
        bookprint.printToScreen(book);
        bookprint.printToHTML(book);

        System.out.println("Gestion transaction...\n");
        BookBusinessLogic transac = new BookBusinessLogic();
        transac.emprunter(book, "Nana");
        transac.autreService(book);

    }
}
