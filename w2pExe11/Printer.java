package w2pExe11;

import w2pExe55.Magazine;

import java.util.ArrayList;
import java.util.List;

public class Printer {


    public void print(Article article) {


        System.out.println("The title is: " + article.getTitle() + " and the text is: " + article.getText());

    }

    public void printMagazine(Magazine magazine) {

        List<Article> articles = magazine.getArticles();
        List<String> content = new ArrayList<>();

        System.out.println("This is the preview of the Magazine: " + magazine.getTitle() + " and the content is: ");
        for (Article article : articles) {
            content.add(article.getTitle());
            content.add(article.getText());
        }

        System.out.println(content);

    }
}


