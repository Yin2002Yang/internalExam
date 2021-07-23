class ThreadLifeCycle implements Runnable
{
    public void run() {}
}

class Main
{
    public static void main(String[] args)
    {
        ThreadLifeCycle tlc = new ThreadLifeCycle();
        Thread t = new Thread(tlc);

        t.setName("Thread(1)");
        t.start();

        System.out.println(t.getName() + " State: " + t.getState());
    }
}
