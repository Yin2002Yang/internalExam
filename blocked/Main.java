class ThreadLifeCycle implements Runnable
{
    Thread t2;
    ThreadLifeCycle()
    {
        t2 = new Thread(this);
    }

    public synchronized void run()
    {
        String name = Thread.currentThread().getName();
        String state = Thread.currentThread().getState().toString();
        System.out.println(name + " is inside run() of class ThreadLifeCycle and state " + state);
        for (int i = 1; i <= 3; i++)
        {
            if (Thread.currentThread().getName().equals("Thread(1)"))
                System.out.println(t2.getName() + " is " + t2.getState());
            System.out.println(" value = " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie) {}
        }
    }
}

class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadLifeCycle tlc = new ThreadLifeCycle();
        Thread t1 = new Thread(tlc);
        t1.setName("Thread(1)");
        tlc.t2.setName("Thread(2)");
        t1.start();
        Thread.sleep(100);
        tlc.t2.start();
    }
}
