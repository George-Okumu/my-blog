package models;

import java.util.ArrayList;

public class Post {
    private String content;
    public static ArrayList<Post> instances = new ArrayList<>();

    public Post(String content) {
        this.content = content;
        instances.add(this);
    }

    public String getContent() {
        return content;
    }
    // this static method returns all posts
    //makes the posts to be displayed in the index.hbs
    public static ArrayList<Post> getAll(){
        return instances;
    }
    public static void clearAllPosts(){
        instances.clear();
    }
}
