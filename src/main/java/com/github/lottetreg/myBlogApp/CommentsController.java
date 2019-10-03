package com.github.lottetreg.myBlogApp;

import com.github.lottetreg.matcha.BaseController;
import com.github.lottetreg.matcha.Model;
import com.github.lottetreg.matcha.Redirect;

public class CommentsController extends BaseController {
  public Redirect create() {
    Model.create(new Comment(getParams()));

    return new Redirect("/posts/" + getParam("postSlug"));
  }
}
