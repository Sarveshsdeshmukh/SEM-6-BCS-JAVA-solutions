import java.util.*;

class SharedResource{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }
}

class IncremnetThread extends Thread{
    private SharedResource sharedResource;
    private int increments;

    IncremnetThread(SharedResource sharedResource , int increments){
        this.sharedResource = sharedResource;
        this.increments = increments;
    }

    public void run(){
        for(int i = 0 ; i < increments;i++){
            sharedResource.increment();
            System.out.println(Thread.currentThread().getName()+":Increment count to "+sharedResource.getCount());
        }
    }
}

class SynchronizationExample{
    public static void main(String[]args){
        SharedResource sharedResource = new SharedResource();
            IncremnetThread thread1 = new IncremnetThread(sharedResource,8);
            IncremnetThread thread2 = new IncremnetThread(sharedResource,5);

            thread1.start();
            thread2.start();
        }
}