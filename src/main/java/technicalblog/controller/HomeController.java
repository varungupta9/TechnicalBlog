package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPosts(Model model)
    {
        ArrayList<Post> posts = new ArrayList<>();
     Post post1 = new Post();
     post1.setTitle("Post1");
     post1.setBody("Post1 Body");
     post1.setDate(new Date());

     Post post2 = new Post();
        post2.setTitle("Post2");
        post2.setBody("Post2 Body");
        post2.setDate(new Date());

     Post post3 = new Post();
        post3.setTitle("Post3");
        post3.setBody("Post3 Body");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);
        return "index";

    }
}
