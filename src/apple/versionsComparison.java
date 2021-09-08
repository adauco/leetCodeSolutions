package apple;
/*App has 2 versions in the log , trying to get  and compare
# write a simple function to compare v1,v2
# If version1 < version2, return 1.
# If version1 > version2, return -1.
# Otherwise, return 0.
#
# compare v1, v2
# sample data returns 0
#     version1 = "0.1.0.0.0"
#     version2 = ".1"
*/

public class versionsComparison {
    public int isSameVersion(String v1, String v2) {
        if(v1.equals(v2))
            return 0;
        String[] ver1 = v1.split("\\.");
        String[] ver2 = v2.split("\\.");
        int longest = Math.max(ver1.length, ver2.length);

        for(int i = 0; i < longest; i++) {
            int vi1, vi2;

            //assigns 0, if array is empty or if it is null
            if(i < ver1.length && !ver1[i].isEmpty()){
                    vi1 = Integer.parseInt(ver1[i]);
            } else {
                    vi1 = 0;
            }
            if(i < ver2.length && !ver2[i].isEmpty()){
                vi2 = Integer.parseInt(ver2[i]);
            } else {
                vi2 = 0;
            }

            if (vi1 > vi2) {
                return 1;
            } else if (vi1 < vi2) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        versionsComparison ver = new versionsComparison();
        System.out.println("IT IS 0 = " + ver.isSameVersion("1.01.","1.001"));
        System.out.println("Should be 0 = " + ver.isSameVersion("1..0","1.0.0"));
        System.out.println("Should be -1, it is  " + ver.isSameVersion("0.1","1.1"));
        System.out.println("Should be 1, it is  " + ver.isSameVersion("1.0.1","1"));
        System.out.println("Should be -1, it is  " + ver.isSameVersion("7.5.2.4","7.5.3"));
       // System.out.println("IT IS 0 = " + ver.compareVersion("1.01","1.001"));

    }

}
