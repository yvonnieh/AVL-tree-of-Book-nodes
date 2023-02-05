/*
 * Project 2:  AVL Tree
 * Due Date:   10/30/2022
 * Name:       Yvonne Hsiao
 * Class:      CS 3345.501
 * Instructor: Kamran Z. Khan
 */
/*
 * Description: Using an input file, insert Book nodes and detect imbalance. 
 * If imbalance is true, then call the proper rotation function to fix the imbalance condition.
 * Then report each imbalance detection and the node where it occurred; and output the message.
 * Finally, print the ISBN inorder, postorder, and preorder.
 * 
 * Input file data: ISBN Number /n Title /n Author’s first and last name
 */
import java.io.*;
import java.util.Scanner;

public class Book implements Comparable<Book>{
    
    // Book variables
    protected String ISBN = " ";
    protected String Title = " ";
    protected String Author = " ";

    // constructor
    public Book(String isbn, String title, String author){
        ISBN = isbn;
        Title = title;
        Author = author;
    }

    // compare the ISBN number so that the tree knows 
    // if the new node is going to left or right subtree
    public int compareTo(Book o){
        return this.ISBN.compareTo(o.ISBN);
    }

    public String toString(){
        return ISBN;
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // Book information variables
        String ISBN = " ";
        String Title = " ";
        String Author = " ";
        // prompt for the file name
        System.out.print("Enter the file name: ");
        try {
            // open the file
            File file = new File(scnr.next());
            Scanner openfile = new Scanner(file);
            // declare an AVL tree with type Book
            AVLTree<Book> tree = new AVLTree<>();
            // create a Book object
            Book book;
            // store the information of the books, create a book node, 
            // and insert it into AVL tree
            while (openfile.hasNextLine()) {
                ISBN = openfile.nextLine();
                Title = openfile.nextLine();
                Author = openfile.nextLine();
                book = new Book(ISBN, Title, Author);
                tree.insert(book);
            }
            openfile.close();
            // print the tree
            int choice;
            while (true) {
                //menu
                System.out.println();
                System.out.println("Print the tree in:");
                System.out.println("1. Inorder (sorted)");
                System.out.println("2. Postorder");
                System.out.println("3. Preorder");
                System.out.println("4. Quit");
                choice = scnr.nextInt();
                switch (choice) {
                    case 1:
                        printTreeInOrder(tree);
                        break;
                    case 2:
                        printTreePostOrder(tree);
                        break;
                    case 3:
                        printTreePreOrder(tree);
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        } catch (FileNotFoundException e) { // throw exception if file not found
            System.out.println("Error: file not found");
        }
    }
    // print the tree inorder
    public static void printTreeInOrder(BST<Book> tree) {
        tree.inorder();
        System.out.println("\nThe number of nodes is " + tree.getSize());
    }
    // print the tree in postorder
    public static void printTreePostOrder(BST<Book> tree) {
        tree.postorder();
        System.out.println("\nThe number of nodes is " + tree.getSize());
    }
    // print the tree in preorder
    public static void printTreePreOrder(BST<Book> tree) {
        tree.preorder();
        System.out.println("\nThe number of nodes is " + tree.getSize());
    }
}
