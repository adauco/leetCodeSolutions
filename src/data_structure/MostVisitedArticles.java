package data_structure;
/*
A famous newspaper wants to determine how popular are the published articles.

As a SW developer, you are asked to implement three methods.
1. articleVisited(articleId) // To increase the visit count for that article (+1)
2. getVisited(articleId) // To get how many times has an article been visited
3. getTopTen() // To retrieve a list of the 10 most popular articles (by visit count)

SOLUTION
Declared a hashmap for article visits and another for topTen String, Integer,
getArticle, just do a mapa.get(article)
articleVisited do a mapa.put(article, 1) if doesn exist, do a map.put(article, get(article)+1), to increment the size
   and call the UpdateTopTen function
*/

import java.util.HashMap;
import java.util.Map;

public class MostVisitedArticles {
    HashMap<String, Integer> articlesVisits = new HashMap();
    HashMap<String, Integer> topTen = new HashMap();

    void articleVisited(String articleId) {
        if(articlesVisits.get(articleId) != null) {
            articlesVisits.put(articleId, articlesVisits.get(articleId)+1);
        } else {
            articlesVisits.put(articleId, 1);
        }
        updateTopTen(articleId);
    }//MAX(O(1), O(1)) plus addTopTen

    int getVisited(String articleId) {
        return articlesVisits.get(articleId);
    }//O(1), solo una revision

    void updateTopTen(String articleId) {
        //Do a loop to get less visited article,
            int min = Integer.MAX_VALUE;
            String key = "";
            int num;
            //For to get the less visited article
            for (Map.Entry<String, Integer> entry : topTen.entrySet()){
                num = entry.getValue();
                if(min > num) {
                    min = num;
                    key = entry.getKey();
                }
            }
            //Compare less visited article with article visits and replace if it is smaller.
            if(articlesVisits.get(articleId) > min) {
                topTen.remove(key);
                topTen.put(articleId, articlesVisits.get(articleId));
            }// O(1), por que siempre va a ser constante 10
    }

    void initializeTop10(HashMap<String, Integer> top) {
        top.put("Article1", 81);
        top.put("Article2", 81);
        top.put("Article3", 71);
        top.put("Article4", 41);
        top.put("Article5", 61);
        top.put("Article6", 61);
        top.put("Article7", 15);
        top.put("Article8", 12);
        top.put("Article9", 1);
        top.put("Article10", 1);
    }

    void initialize(HashMap<String, Integer> elmapa) {
        elmapa.put("Article1", 81);
        elmapa.put("Article2", 81);
        elmapa.put("Article3", 71);
        elmapa.put("Article4", 41);
        elmapa.put("Article5", 61);
        elmapa.put("Article6", 61);
        elmapa.put("Article7", 15);
        elmapa.put("Article8", 12);
        elmapa.put("Article9", 1);
        elmapa.put("Article10", 1);
        elmapa.put("Article11", 0);
        elmapa.put("Article12", 0);
    }

    public static void main(String[] args){

        MostVisitedArticles polo = new MostVisitedArticles();
        polo.initializeTop10(polo.topTen);
        polo.initialize(polo.articlesVisits);
        polo.articleVisited("articleBB");
        polo.articleVisited("Article11");
        polo.articleVisited("Article11");
        polo.articleVisited("Article11");
        System.out.println("Article1 " + polo.getVisited("Article1"));
    }
}