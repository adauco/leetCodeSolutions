public class compressString {

        static public int compress(char[] chars) {
            int anchor = 0, write = 0;
            for (int read = 0; read < chars.length; read++) {
                if ((chars.length == (read + 1)) || (chars[read + 1] != chars[read])) {
                    chars[write++] = chars[anchor];
                        for (char c : ("" + (read - anchor + 1)).toCharArray()) {
                            chars[write++] = c;
                    }
                    anchor = read + 1;
                }
            }
            System.out.println("" + new String(chars));

            return write;
        }

    public static void main(String args[]) {

        char[] charArray ={ 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c' };

        System.out.println("PRINT " + compress(charArray));
    }
}
