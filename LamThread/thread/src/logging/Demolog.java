package logging;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Demolog {
    private static final java.util.logging.Logger logger =
            Logger.getLogger(Demolog.class.getName());

    public static void main(String[] args) {

        logger.info("Chương trình bắt đầu");

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Có lỗi xảy ra", e);
        }

        logger.warning("Kết thúc chương trình");
    }
}
