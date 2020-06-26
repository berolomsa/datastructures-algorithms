package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class KthClosestStar {
    public static void main(String[] args) {
        Star star1 = new Star(200,200,200);
        Star star2 = new Star(150,150,150);
        Star star3 = new Star(100,100,100);
        Star star4 = new Star(90,90,90);
        Star star5 = new Star(50,50,50);
        Star star6 = new Star(10,10,10);
        List<Star>stars = new ArrayList<>();
        stars.add(star1);
        stars.add(star2);
        stars.add(star3);
        stars.add(star4);
        stars.add(star5);
        stars.add(star6);
        findKClosestStar(stars.iterator(),2);
    }


    public static void findKClosestStar(Iterator<Star> iterator, int k) {
        PriorityQueue<Star> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            if (iterator.hasNext()) {
                priorityQueue.add(iterator.next());
            }
        }

        while (iterator.hasNext()) {
            priorityQueue.add(iterator.next());
            priorityQueue.poll();
        }
        List<Star> result = new ArrayList<>(priorityQueue);
        Collections.sort(result);
        result.forEach(a -> System.out.println(a.x));
    }

    public static class Star implements Comparable<Star> {
        private int x;
        private int y;
        private int z;

        public Star(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distance() {
            return Math.sqrt(x*x + y*y+z*z);
        }

        @Override public int compareTo(Star o) {
            return Double.compare(this.distance(), o.distance());
        }
    }
}
