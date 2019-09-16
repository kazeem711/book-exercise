/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Kazeem Azeez
 * @version 09/16/2019
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages; 
    private String refNumber;
    private boolean t; 
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNum, boolean idk)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNum; 
        t = idk;
    }
    
    /**
     * Accessor method to return the author field 
     */
    
    public String getAuthor()
    {
        //return the author of the book 
        return author;
    }
    
    /**
     * Accesor method to return the book title field 
     */
    public String getTitle()
    {
        //return title of book 
        return title;
    }
    
    /**
     * Accessor method to return the book pages 
     */
    public int getPages()
    {
       // return the page numbers 
       return pages; 
    }
    
    /**
     * Method will print out the book's details to the terminal 
     */
    public void printDetails(String bookTitle , String bookAuthor)
    {
        //printing the book details 
        System.out.println("Title: "+ bookTitle + ", Author: "+ bookAuthor + ". Pages" + pages);
    }
    

    // Add the methods here ...
}
