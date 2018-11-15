package w2pExe55;

import w2pExe11.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String title;
    private List<Article> articles = new ArrayList<>();

    public Magazine(String title) {
        this.title = title;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public String getTitle() {
        return title;
    }

    public List<Article> add(Article article) {

        articles.add(article);

        return articles;
    }
}
