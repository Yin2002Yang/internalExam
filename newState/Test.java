class ThreadLifeCycle implements Runnable
{
    public void run() {}
}

class Test
{
    public static void main(String[] args)
    {
        ThreadLifeCycle tlc = new ThreadLifeCycle();
        Thread t = new Thread(tlc);
        System.out.println("Thread state: " + t.getState());
    }
}
