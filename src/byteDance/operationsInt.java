package byteDance;

public class operationsInt {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0; i < operations.length; i++){
            if(operations[i].contains("++")){
                x = x+1;
            } else {
                x = x -1;
            }
        }
        return x;
    }

    public String restoreString(String s, int[] indices) {
        char cs[]= new char[indices.length];
        for(int i=0; i< indices.length; i++){
          // cs[indices[i]]=s.charAt(i);
            cs[i]=s.charAt(indices[i]);

        }
        return new String(cs);
    }

    public static void main(String[] args) {
        operationsInt ope = new operationsInt();
        String[] operations = new String[]{"--X","X++","X++"};
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(ope.restoreString(s, indices));

        System.out.println(ope.restoreString("abc", new int[]{0,1,2}));
        System.out.println(ope.restoreString("aaiougrt", new int[]{4,0,2,6,7,3,1,5}));

       /* System.out.println(ope.finalValueAfterOperations(operations));
        System.out.println(ope.finalValueAfterOperations(new String[]{"++X","++X","X++"}));
        System.out.println(ope.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));*/
    }

}
