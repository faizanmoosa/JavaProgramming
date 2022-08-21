class Item {
    int i;
    boolean produced = false;
    public synchronized void produce(int x) {
        i = x;
        if(produced) {
            try {
                wait();
            }
            catch(InterruptedException ie) {}
        }
        produced = true;
        notify();
    }
    public synchronized void consume() {
        if(!produced) {
            try {
                wait();
            }
            catch(InterruptedException ie) {}
        }
        produced = false;
        notify();
    }
}
class Producer extends Thread {
    Item it = new Item();
    Producer(Item it) {
        this.it = it;
    }
    public void run() {
        for(int i=1;i<4;i++) {
            System.out.println("Producer: "+i);
            it.produce(i);
        }
    }
}
class Consumer extends Thread {
    Item it = new Item();
    Consumer(Item it) {
        this.it = it;
    }
    public void run() {
        for(int i=1;i<4;i++) {
            System.out.println("Consumer: "+i);
            it.consume();
        }
    }
}
public class ProducerConsumer {
    public static void main(String a[]) {
        Item it = new Item();
        Producer p = new Producer(it);
        Consumer c = new Consumer(it);
        p.start();
        c.start();
    }
}