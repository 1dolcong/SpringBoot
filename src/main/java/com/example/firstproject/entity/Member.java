package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private String email;
    @Column
    private String title;
    @Column
    private String content;

    public Member(String id, String title, String content) {
        this.email = email;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + email +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
