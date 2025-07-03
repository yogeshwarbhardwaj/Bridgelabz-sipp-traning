// Class representing a Node (a Movie)
class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode prev;
    MovieNode next;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

// Class managing the Movie List
public class MovieManagementSystem {
    private MovieNode head;
    private MovieNode tail;

    public MovieManagementSystem() {
        this.head = null;
        this.tail = null;
    }

    // Add at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode; // List was empty
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode; // List was empty
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at a specific position
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position == 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode current = head;
        int index = 0;
        while (current != null && index < position) {
            current = current.next;
            index++;
        }
        if (current == null) {
            addAtEnd(title, director, year, rating);
        } else {
            MovieNode newNode = new MovieNode(title, director, year, rating);
            MovieNode prevNode = current.prev;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = current;
            current.prev = newNode;
        }
    }

    // Remove a movie by Title
    public void removeByTitle(String title) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Removed movie: " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    // Search movies by director or rating
    public void search(String criterion, Object value) {
        MovieNode current = head;
        System.out.println("Search Results:");
        while (current != null) {
            if (criterion.equalsIgnoreCase("director") && current.director.equals(value)) {
                displayMovie(current);
            } else if (criterion.equalsIgnoreCase("rating") && current.rating == (double) value) {
                displayMovie(current);
            }
            current = current.next;
        }
    }

    // Display all movies forward
    public void displayForward() {
        MovieNode current = head;
        System.out.println("Movies in Forward Order:");
        while (current != null) {
            displayMovie(current);
            current = current.next;
        }
    }

    // Display all movies in reverse
    public void displayReverse() {
        MovieNode current = tail;
        System.out.println("Movies in Reverse Order:");
        while (current != null) {
            displayMovie(current);
            current = current.prev;
        }
    }

    // Update a movie's rating
    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    // Helper method to display a movie's details
    private void displayMovie(MovieNode movie) {
        System.out.println("Title: " + movie.title + ", Director: " + movie.director +
                ", Year: " + movie.year + ", Rating: " + movie.rating);
    }
}