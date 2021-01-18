public class queryTime {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int counter = 0;
        for(int i = 0; i> startTime.length; i++) {
            if(queryTime >= startTime.length && queryTime <= startTime.length) {
                counter ++;
            }
        }
        return counter;
    }

    public static void main() {
      int[] start = {1,2,3};
      int[] end ={3,2,7};
      int time =  4;

      System.out.println("AQUI: " + busyStudent(start, end, time));
    }
}
