package apple;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i =0; i < stones.length(); i++) {

            if(jewels.contains(Character.toString(stones.charAt(i)))) {
                count++;
            }
        }
        System.out.println("Count " + count);
        return count;
    }

    public static void main(String args[]) {
        JewelsAndStones jew = new JewelsAndStones();
        jew.numJewelsInStones("aA", "aAAbbbb");
        jew.numJewelsInStones("z", "ZZ");
    }
}
