package com.github.lottetreg.myBlogApp;

import com.github.lottetreg.matcha.Matcha;
import com.github.lottetreg.matcha.Routable;
import com.github.lottetreg.matcha.Route;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MyBlogApp {
  public static void main(String[] args) {
    try {
      new Matcha(getRoutes()).serve(Integer.parseInt(args[0]));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static List<Routable> getRoutes() {
    return Arrays.asList(
        new Route("GET", "/posts", PostsController.class, "index"),
        new Route("GET", "/posts/:slug", PostsController.class, "show")
    );
  }
}
