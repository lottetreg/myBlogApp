package com.github.lottetreg.myBlogApp;

import com.github.lottetreg.matcha.Matcha;

import java.io.IOException;
import java.util.ArrayList;

public class MyBlogApp {
  public static void main(String[] args) {
    try {
      new Matcha(new ArrayList<>()).serve(Integer.parseInt(args[0]));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
