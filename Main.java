class ThreadLifeCycle implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(10);
        }
        catch(InterruptedException ie) {}
    }
}

class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadLifeCycle tlc = new ThreadLifeCycle();
        Thread t1 = new Thread(tlc);
        t1.setName("Thread(1)");
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getName() + " in main is in " + t1.getState() + " state.");
    }
}
