//print 0,2,4,6,8,10,12,14,16,18
/*
 *  initlization st:  int i=0;
 *   conditional st:  i<20
 *          incr st:   i = i+2
 */
class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i = i + 2) {
            System.out.println(i);
        }
    }
}