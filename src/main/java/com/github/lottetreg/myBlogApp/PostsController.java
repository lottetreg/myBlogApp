package com.github.lottetreg.myBlogApp;

import com.github.lottetreg.matcha.BaseController;
import com.github.lottetreg.matcha.Model;
import com.github.lottetreg.matcha.Redirect;
import com.github.lottetreg.matcha.Template;

public class PostsController extends BaseController {

  public Template index() {
    addData("posts", Model.all(Post.class));

    return new Template("/templates/posts/index.twig.html");
  }

  public Template show() {
    Post post = Model.findBy(Post.class, "slug", getParam("slug"));
    addData("post", post);

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
