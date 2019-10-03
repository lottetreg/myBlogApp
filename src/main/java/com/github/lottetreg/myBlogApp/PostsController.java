package com.github.lottetreg.myBlogApp;

import com.github.lottetreg.matcha.BaseController;
import com.github.lottetreg.matcha.Model;
import com.github.lottetreg.matcha.Redirect;
import com.github.lottetreg.matcha.Template;

import java.util.List;

public class PostsController extends BaseController {

  public Template index() {
    addData("posts", Model.all(Post.class));

    return new Template("/templates/posts/index.twig.html");
  }

  public Template show() {
    Post post = Model.findFirstBy(Post.class, "slug", getParam("slug"));
    addData("post", post);

    List<Comment> comments = Model.findBy(Comment.class, "postSlug", post.slug);
    addData("comments", comments);

    return new Template("/templates/posts/show.twig.html");
  }

  public Template newForm() {
    return new Template("/templates/posts/newForm.twig.html");
  }

  public Redirect create() {
    Post post = Model.create(new Post(getParams()));

    return new Redirect("/posts/" + post.slug);
  }
}
