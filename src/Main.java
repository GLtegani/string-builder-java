import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(
                LocalDateTime.parse("21/06/2018 13:05:44", format),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12
                );


        post.addComment(new Comment("Have a nice trip!"));
        post.addComment(new Comment("Wow that's awesome!"));


        System.out.println(post);
        sc.close();
    }
}