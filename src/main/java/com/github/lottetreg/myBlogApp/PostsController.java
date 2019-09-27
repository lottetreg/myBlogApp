package com.github.lottetreg.myBlogApp;

import com.github.lottetreg.matcha.BaseController;
import com.github.lottetreg.matcha.BaseModel;
import com.github.lottetreg.matcha.Template;

public class PostsController extends BaseController {

  public Template index() {
    addData("posts", BaseModel.all(Post.class));
    return new Template("/templates/posts/index.twig.html");
  }
}
