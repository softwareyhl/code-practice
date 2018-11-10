import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * @Auther: LT305
 * @Date: 2018/11/10 21:37
 * @Description:
 */
public class MyFileTest {
    @Test
    public void test() {
        File file = new File(this.getClass().getResource("test.json").getPath());
        try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
