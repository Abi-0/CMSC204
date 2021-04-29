import java.util.PriorityQueue;
import java.util.Random;


public class CarQueue {


    Random rand = new Random();
    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
    private int out;

    public CarQueue(){
        for (int i = 0; i < 13; i++) {
            q.add(rand.nextInt(4));
        }


    }

    public void addToQueue() {

        class ToRun implements Runnable
        {

            public void run()
            {

                q.add(rand.nextInt(4));
                q.add(rand.nextInt(4));
                q.add(rand.nextInt(4));
                q.add(rand.nextInt(4));
                q.add(rand.nextInt(4));
                q.add(rand.nextInt(4));
                q.add(rand.nextInt(4));


            }
        }
        Runnable run = new ToRun();
        Thread thread = new Thread(run);

        thread.start();
    }

    public int deleteQueue() {

        class ToRun implements Runnable {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }

                if(q.size() < 20){
                    for (int i = 0; i < 14; i++) {
                        q.add(rand.nextInt(4));
                    }

                }
                else if (!q.isEmpty()){
                    out = q.remove();
                }


            }

        }
        Runnable r = new ToRun();
        Thread t = new Thread(r);

        t.start();


        return out;

    }

}