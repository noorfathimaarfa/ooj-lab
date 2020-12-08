class NewThread implements Runnable {
    String name;
    Thread t;
    int time;
    NewThread(String threadname,int time) {
    name = threadname;
    this.time=time;
    t = new Thread(this, name);
    System.out.println("thread:"+ t);
    t.start(); 
    }
    public void run() {
    try {
    for(int i = 5; i > 0; i--) {
    System.out.println(name);
    Thread.sleep(time);
    }
    } catch (InterruptedException e) {
    System.out.println(name + "Interrupted");
    }
    System.out.println(name + " exiting.");
    }
    }
  public  class threadm {
    public static void main(String args[]) {
    NewThread t1=new NewThread("BMS COLLEGE OF ENGINEERING",10000);
    NewThread t2=new NewThread("CSE",2000);
    }
    }
