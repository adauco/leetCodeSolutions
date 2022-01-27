package Microsoft;

public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(int i = 0; i < sentences.length; i++) {
            max = Math.max(max,sentences[i].split(" ").length);
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        MostWordsFound sol = new MostWordsFound();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences2 = {"please wait", "continue to fight", "continue to win"};
        sol.mostWordsFound(sentences);
        sol.mostWordsFound(sentences2);
    }
}
