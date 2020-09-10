import models.Post;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.staticFileLocation;
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/posts/new", (req,res)->{
            Map<String, Object> model = new HashMap<>();
            String content = req.queryParams("content");// We fetch the user-inputted post content from the form and save it into a String
            Post newPost = new Post(content);// Make a new Post object, call it newPost.
            return new ModelAndView(model, "success.hbs");
        });

    }
}
