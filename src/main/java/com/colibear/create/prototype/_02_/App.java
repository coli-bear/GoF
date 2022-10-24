package com.colibear.create.prototype._02_;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setName("live-study");
        repository.setUser("coli-bear");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("1주차 과제는 없어");

        String url = issue.getUrl();
        System.out.println("url = " + url);

        GithubIssue issue2 = (GithubIssue) issue.clone();
        
    }
}
