package com.colibear.create.prototype._01_;

public class App {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setName("live-study");
        repository.setUser("coli-bear");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("1주차 과제는 없어");

        String url = issue.getUrl();
        System.out.println("url = " + url);


    }
}
