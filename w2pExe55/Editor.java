package w2pExe55;

import w2pExe11.Article;

public class Editor {

    public Magazine writeMagazine() {

        Article article1 = new Article("The Article one", "Wisdom");
        Article article2 = new Article("The Article two", "Empathy");
        Article article3 = new Article("The Article three", "Thinking");

        Magazine magazine = new Magazine("THE MAGAZINE");
        magazine.add(article1);
        magazine.add(article2);
        magazine.add(article3);

        return magazine;

    }
}
