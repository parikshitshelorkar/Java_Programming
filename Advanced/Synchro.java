class Table{
    //lock
    synchronized void print(int n){ //synchronized will run one thread at a time
        for (int i=1; i<=100; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Synchro {
    
}

//1. Mutual Exclusive Synchroniation
// a. method synchronization
// b. block synchronization
// c. static synchronization



//2. Inter thread communication
/* balance 1000
withdraw 1500 : wait
----deposit 2000 : notify
wait() -> release lock and wait for notify()
 */