package YandexHandBook;
import java.util.*;

class CompInter implements  Comparator<Interval>{
    public int compare(Interval p1, Interval p2){
        return Integer.compare(p1.getFinish(), p2.getFinish());
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

    @Override
    public int hashCode() {
            return (this.v1 * this.v2)/(this.v2+this.v1);//деление на 0
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Interval) {
            Interval inter = (Interval) obj;
            boolean res = (this.v1 == inter.getStart() && this.v2 == inter.getFinish());
            return res;
        } else return false;
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

            //удалить повторяющиеся слоты
            Set<Interval> set = new HashSet<>(list);
            list=new LinkedList<Interval>(set);

            CompInter comp = new CompInter();
            list.sort(comp);
            LinkedList<Interval> resultList = new LinkedList<>();
            while (!list.isEmpty()) {
                Interval current = list.getFirst();
                resultList.add(current);
                int check=current.getFinish();
                list.remove(current);
                Iterator it =list.iterator();
                while (it.hasNext()){
                    Interval inter = (Interval) it.next();
                    if(inter.getStart()<=check){
                         it.remove();//list.remove(inter);
                    }
                }
            }
            System.out.println(resultList.size());
        }
    }