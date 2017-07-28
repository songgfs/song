/**
 * Created by 18237161432 on 2017/7/24.
 */
public class data {


        public static void main(String args[]) {
            data dt = new data();
            dt.n();
            dt.m();
        }
        public void n() {
            Integer a = new Integer(200);
            Integer b = 200;
            System.out.println("n result " + (a == b));
        }
        public void m() {
            Integer a = new Integer(100);
            Integer b = 160;
            System.out.println("m result " + (a == b));
        }


    }


