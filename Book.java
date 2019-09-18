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
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNum, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNum; 
        refNumber = "";
        this.courseText = courseText;
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
     * Sets the reference number for this book 
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3){
            refNumber = ref;
        }
        else{
            System.out.println("Error! The reference number must be at least 3 characters long.");
        }   
    }
    
    /**
     * Accessor method to return the reference number 
     */
    public String getRefNumber()
    {
     return refNumber;    
    }
    
    /**
     * Prints the title of the book 
     */
    public void printTitle()
    {
       System.out.println("Title: " + title); 
    }
    
    /**
     * Prints the name of the author 
     */
    public void printAuthor()
    {
       System.out.println("Author: " + author);
    }
    
    /**
     * Method will print out the book's details to the terminal 
     */
    public void printDetails(String bookTitle , String bookAuthor)
    {
        //printing the book details 
        System.out.println("Title: "+ bookTitle + ", Author: "+ bookAuthor + ". Pages" + pages);
        String refNumberString;
        if(refNumber.length() > 0){
            refNumberString = refNumber; 
        }
        else{
            refNumberString = "ZZZ"; 
        }
        System.out.println("Reference number: " + refNumberString);
        System.out.println("Borrowed: " + borrowed);
    }
    
    /**
     * Accesor method to return the number of times the book has been borrowed
     */
    
    public int getBorrowed()
    {
        return borrowed; 
    }
    
    /**
     * Borrows the book. counts the number of times the book has been borrowed
     */
    
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * return the course text 
     */
    public boolean isCourseText()
    {
     return courseText;   
        
    }
    

    // Add the methods here ...
}
