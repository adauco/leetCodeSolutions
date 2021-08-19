package data_structure;
public class multiArray{

    void printMultiA(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    void printMultiA(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean searchElement(String ele, String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(ele == array[i][j]) {
                    System.out.println("TRUE");
                    return true;
                }
            }
        }
        System.out.println("FALSE");
        return false;
    }

        public static void main (String[]args){
            multiArray ma = new multiArray();
            int[][] multi = {{1, 2}, {3, 4}};
            String[][] DB = {{"Juan", "Quezada"}, {"Rosalia", "Maraveles"}, {"Julieta", "Quezaveles"}};
            ma.printMultiA(DB);
            ma.printMultiA(multi);
            ma.searchElement("uana", DB);
            ma.searchElement("", DB);
            ma.searchElement("Rosalia", DB);
            ma.searchElement("jPPP", DB);
            ma.searchElement("Quezaveles", DB);
        }
    }
