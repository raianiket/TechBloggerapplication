package techblogapp.service;

import org.springframework.stereotype.Service;
import techblogapp.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> posts=new ArrayList<Post>();
        Post p1=new Post(),p2=new Post(),p3=new Post(); //Dependency
        p1.setTitle("Shubham's Post");
        p1.setBody("This is the body of shubham post");
        p1.setDate(new Date());
        p2.setTitle("Aniket's Post");
        p2.setBody("This is the body of aniket post");
        p2.setDate(new Date());
        p3.setTitle("Srajan's Post");
        p3.setBody("This is the body of srajan post");
        p3.setDate(new Date());
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        return posts;

    }
    public ArrayList<Post> getUserPosts(){
        ArrayList<Post> posts=new ArrayList<Post>();
        Post p2=new Post(); //Dependency
        p2.setTitle("Shubham's Post");
        p2.setBody("This is the body of shuhbam post");
        p2.setDate(new Date());
        posts.add(p2);

        return posts;

    }

    public void createUserPost(Post post, String loggeduser) {
        System.out.println("Post Created by "+loggeduser);
        System.out.println("Post Tittle :"+post.getTitle());
        System.out.println("Post Date :"+post.getDate().toString());
        System.out.println("Post Body :"+post.getBody());
    }
}
