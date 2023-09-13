package YandexHandBook;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Comparator;

class CompInter implements  Comparator<Interval>{
    public int compare(Interval p1, Interval p2){
        return Integer.compare(p1.getStart(), p2.getStart());
    }
}
class Interval{
    int v1;
    int v2;
    public int getStart() {
            return v1;
        }
    public int getFinish() {
        return v2;
    }

    public Interval(int v1, int v2){
        this.v1=v1;
        this.v2=v2;
    }
}
public class Task_3_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            LinkedList<Interval> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                list.add(new Interval(a, b));
            }
            CompInter comp = new CompInter();
            list.sort(comp.reversed());
            LinkedList<Interval> resultList = new LinkedList<>();
            while (!list.isEmpty()) {
                Interval resultPart;
                int finish = 100;
                for(Interval inter : list){
                    int v2 = inter.getFinish();
                    if(v2<finish) {
                        resultPart = inter;
                        finish=v2;
                    }
                }
               /* if(resultPart.!=null)
                    resultList.add(resultPart);*/

            }
        }
    }