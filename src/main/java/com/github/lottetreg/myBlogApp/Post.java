package com.github.lottetreg.myBlogApp;

import com.github.lottetreg.matcha.Model;

import java.util.Map;

public class Post extends Model {
  public String slug;
  public String title;
  public String body;

  public Post(Map<String, String> data) {
    super(data);
  }
}
