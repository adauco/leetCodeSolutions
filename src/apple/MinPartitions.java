package apple;

public class MinPartitions {

    public int minPartitions(String n) {
        long maxBin = 0;
        String[] newstring = new String[n.length()/10];
        newstring = n.split("(?<=\\G.{10})");

        for(int j = 0; j < newstring.length; j++) {
            long nInt = Long.parseLong(newstring[j]);
            for (int i = 0; i < newstring[j].length(); i++) {
                long temp = nInt % 10;
                nInt = nInt / 10;
                maxBin = Math.max(maxBin, temp);
            }
        }
        System.out.println("MAX1 " + maxBin);
        return (int)maxBin;
    }

    public int minPartitions2(String n){
        int max = 0;
        for(char c : n.toCharArray()) {
            max = Math.max(max, Character.getNumericValue(c));
        }
        System.out.println("MAX2 " + max);
        return max;
    }

    public int minPartitions3(String n){
        char max = '0';
        for(char c : n.toCharArray()) {
            if(c>max){
                max = c;
            }
        }
        System.out.println("MAX3 " + max);
        return Integer.parseInt(String.valueOf(max));
    }

    public static void main(String args[]) {
        MinPartitions min = new MinPartitions();
        min.minPartitions3("32");
        min.minPartitions3("82734");
        min.minPartitions("27346209830709182346");
        min.minPartitions2("27346209830709182346");
        min.minPartitions3("27346209830709182346");

    }

}
