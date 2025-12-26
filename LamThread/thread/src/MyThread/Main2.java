package MyThread;

class FileHandler {
    void processFile() {
        System.out.println("Processing file...");
    }
}

class DownloadTask extends FileHandler implements Runnable {

    @Override
    public void run() {
        processFile();
        System.out.println("Downloading...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Thread t = new Thread(new DownloadTask());
        t.start();
    }
}

