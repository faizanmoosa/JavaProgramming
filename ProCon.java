class Item {
    int i;
    boolean produced = false;
    public synchronized void produce(int x) {
        try {
            if(produced) {
                wait();
            }
            i=x;
            produced = true;
            notify();
        }
        catch(InterruptedException ie) {
            ie.getMessage();
        }
    }
    public synchronized int consume() {
        try {
            if(!produced) {
                wait();
            }
            produced = false;
            notify();
        }
        catch(InterruptedException ie) {
            ie.getMessage();
        }
        return i;
    }
}
class Producer extends Thread {
    Item it = new Item();
    Producer(Item it) {
        this.it = it;
    }
    public void run() {
        for(int i=1;i<=5;i++) {
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
        for(int i=1;i<=5;i++) {
            int item = it.consume();
            System.out.println("Consumer: "+item);
        }
    }
}
class ProCon {
    public static void main(String s[]) {
        Item it = new Item();
        Producer p = new Producer(it);
        Consumer c = new Consumer(it);
        p.start();
        c.start();
    }
}
