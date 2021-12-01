package prak2;

public class Book {
    private int num_pages;
    private int year;
    private String publisher;

    public Book(int num_pages, int year, String publisher)
    {
        this.num_pages = num_pages;
        this.year = year;
        this.publisher = publisher;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public int getNum_pages()
    {
        return num_pages;
    }

    public int getYear()
    {
        return year;
    }

    public void setNum_pages(int num_pages)
    {
        this.num_pages = num_pages;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String toString()
    {
        return "Book{publisher is " + publisher + ", year of publishing is " + year + ", number of pages is " + num_pages + "}.";
    }
}
