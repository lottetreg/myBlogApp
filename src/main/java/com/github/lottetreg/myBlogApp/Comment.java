package com.github.lottetreg.myBlogApp;

import com.github.lottetreg.matcha.Model;

import java.util.Map;

public class Comment extends Model {
  public String postSlug;
  public String body;

  public Comment(Map<String, Object> data) {
    super(data);
  }
}
