package data_structure;

import java.util.HashSet;
import java.util.Set;

/*
There is a rectangular matrix of letters, e.g.,
And there is an API that returns true if a provided word exists in the English language, e.g.,
exists("tree"); // returns true
Write a program that traverses all the positions the matrix in a "Classic Snake Game" fashion.
That means, it can start in any position moving only left/right/up/down without passing through the same position again in the same run.

Per example: in the Matrix above, starting on the top left position, the program would find the word TREE.
From the bottom right position, it would find the word FOUR.
N, E, O, S

char[] matrix = {'c','f','e'}
SOLUTION:
Do a Depth first search on each element of matrix
    loop using I and J through the elements.
    Initialize visited hash and strinbuilder word,
    call function to visit children or cardinal points
Function to validate children
    validate element is not edge or not visited
    append char to word
    call oxford function  and print if exists in dictionary
    recursively call itself for up, down, rigth and left children from elements
    remove the char from the stringBuilder
 */
public class SnakePolo {
    static int count = 0;
    public static void traverseMatrix(char[][] matrix) {
        count =0;
        for(int i =0; i < matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                Set<String> visited = new HashSet<>();
                StringBuilder word = new StringBuilder();
                goCardinals(matrix,i,j,visited,word);
            }
        }
        System.out.println("Count " + count);
    }

    public static void goCardinals(char[][] matrix, int i, int j, Set<String> visited, StringBuilder word) {
        if(i<0 || j < 0 || i >matrix.length-1 || j > matrix[i].length-1 || visited.contains(i+","+j)) {
            return;
        }
        count++;
        word.append(matrix[i][j]);
        visited.add(i+","+j);
        if(isOxford(word.toString()))
            System.out.println("WORD " + word.toString());
        goCardinals(matrix,i-1,j,visited,word);//UP
        goCardinals(matrix,i,j+1,visited,word);//right
        goCardinals(matrix,i+1,j,visited,word);//down
        goCardinals(matrix,i,j-1,visited,word);//left
        visited.remove(i+","+j);
        word.deleteCharAt(word.length()-1);
    }

    static boolean isOxford(String word){
        Set<String> diccionary = new HashSet<>();
        diccionary.add("tree");
        diccionary.add("four");
        diccionary.add("palabra");
        return diccionary.contains(word);
    }

    public static void main(String[] args) {
        char[][] matrix = {{'t','r','e','x','z'},
                          {'o','k','e','l','u'},
                          {'h','r','u','o','f'}};

        traverseMatrix(matrix);
    }
}
