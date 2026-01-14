import java.util.logging.Logger;


public class TestLog {
    private static final Logger logger = Logger.getLogger(TestLog.class.getName());

    public static void main(String[] args) {
         for( int i =1 ; i<=5 ; i++){
                System.out.println("sô ra là" +i);
            }

        logger.info("Chương trình bắt đầu");

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            logger.severe("Lỗi xảy ra: " + e.getMessage());
        }

    }
}
