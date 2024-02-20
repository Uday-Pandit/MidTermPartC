/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author udays
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Science Fiction");
        System.out.println("4. Horror");
        System.out.println("5. Romance");


        System.out.println("Enter the number corresponding to your favorite genre:");
        int choice = scanner.nextInt();
        String genre = "";

      
        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Horror";
                break;
            case 5:
                genre = "Romance";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Drama.");
                genre = "Drama";
        }

        
        System.out.println("User profile created successfully!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);

        scanner.close();
    }
}
