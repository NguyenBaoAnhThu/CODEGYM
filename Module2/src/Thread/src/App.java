public class App {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            int total1 = 0 ;
            @Override
            public void run() {
                for ( int i = 0 ; i < 10000 ; i++ ){
                    if(i%2 ==0){
                        total1 += i ;
                    }
                }
                System.out.println("Tong so chan " + total1);
            }
        });
        // chạy thread
        thread1.start();
        Thread thread2=new Thread(new Runnable() {
            int total2 = 0;
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    if (i % 2 != 0) {
                        total2 += i;
                    }
                }
                System.out.println("Tong so le: "+total2);
            }
        });
        thread2.start();
        System.out.println("End thread main");
    }
}
