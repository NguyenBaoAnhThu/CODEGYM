package OOP.StopWatch;
import java.time.Instant;

public class StopWatch {
    private long startTime ;
    private long endTime ;
    // Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống
    public StopWatch(){
        this.startTime = Instant.now().toEpochMilli();
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void start(){
        this.startTime = Instant.now().toEpochMilli();
    }
    public void stop(){
        this.endTime = Instant.now().toEpochMilli();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        // Tạo một mảng ngẫu nhiên gồm 100,000 số nguyên
        int size = 100000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * size);
        }

        // Tạo đối tượng StopWatch
        StopWatch sw = new StopWatch();

        // Bắt đầu đo thời gian thực thi của thuật toán sắp xếp chọn
        sw.start();
        selectionSort(array);
        sw.stop();

        // In ra thời gian thực thi của thuật toán sắp xếp chọn
        System.out.println("Elapsed Time for Selection Sort: " + sw.getElapsedTime() + " milliseconds");
    }

    // Thuật toán sắp xếp chọn (Selection Sort)
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
