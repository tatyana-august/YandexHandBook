package YandexHandBook;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Comparator;

class CompPart implements  Comparator<Part>{
    public int compare(Part p1, Part p2){
        if(p1.getStart()>p2.getStart())
            return -1;
        else
            if(p1.getStart()<p2.getStart())
                return 1;
            else
                return 0;
    }}
class Part{
        public int getStart() {
            return v1;
        }
    public int getFinish() {
        return v2;
    }

        int v1;
        int v2;
        public Part(int v1, int v2){
            this.v1=v1;
            this.v2=v2;
        }

    };
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            LinkedList<Part> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                list.add(new Part(a, b));
            }
            CompPart comp = new CompPart();
            list.sort(comp);
            int start = 0;
            LinkedList<Part> resultList = new LinkedList<>();
            while (!list.isEmpty()) {
                Part resultPart;
                int finish = 100;
                Iterator iterator = list.iterator();
                while(iterator.hasNext()){
                    Part currentPart = (Part)iterator.next();
                    int v2 = currentPart.getFinish();
                    if(v2<finish) {
                        resultPart = currentPart;
                        finish=v2;
                    }

                }
               /* if(resultPart.!=null)
                    resultList.add(resultPart);*/

            }
        }
    }