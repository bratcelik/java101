package BookSorter;

public class Book implements Comparable<Book>{
    private String name;
    private String authorName;
    private int releaseDate;
    private int pages;

    public Book(String name, String authorName, int releaseDate, int pages) {
        this.name = name;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
        this.pages = pages;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
