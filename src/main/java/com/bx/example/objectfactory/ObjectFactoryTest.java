package com.bx.example.objectfactory;


import com.bx.example.domain.Blog;

/**
 * @Author: qingshan
 */
public class ObjectFactoryTest {
    public static void main(String[] args) {
        GPObjectFactory factory = new GPObjectFactory();
        Blog myBlog = (Blog) factory.create(Blog.class);
        System.out.println(myBlog);
    }
}
