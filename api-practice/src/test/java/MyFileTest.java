import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: LT305
 * @Date: 2018/11/10 21:37
 * @Description:
 */
public class MyFileTest {
    Logger logger = Logger.getLogger(this.getClass().getName());

    @Test
    public void testFileAPI() {
        File file = new File(this.getClass().getResource("test.json").getPath());
        try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }


    @Test
    public void testSplitWords() {
        File file = new File(this.getClass().getResource("testfile.txt").getPath());
        try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
            stream.map(line -> line.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList()).stream().forEach(str -> System.out.println(str));
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    @Test
    public void testSplitWords2() {
        Map<String, Integer> wordMap = new HashMap<>();
        Stream.of("123 3333 aaa", "222 Bbb a", "kjad a", "asdf a").map(line -> line.split(" ")).forEach(strArray -> {
            for (String str : strArray) {
                wordMap.put(str, wordMap.getOrDefault(str, 0) + 1);
            }
        });

        wordMap.forEach((K, V) -> System.out.println(K + ":" + V));
    }


    @Test
    public void testFileCountContainKeyWords() throws Exception {
        File files = new File("/Code_Space/code-practice/api-practice/src/test/java/");
        int count = 0;
        List<FutureTask<Boolean>> futureList = Lists.newArrayList();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (File file : files.listFiles()) {
            if (file.isDirectory()) {
                continue;
            }
            WordMatchTask task = new WordMatchTask(file);
            FutureTask<Boolean> futureTask = new FutureTask<>(task);
            futureList.add(futureTask);
            executorService.submit(futureTask);
        }
        for (FutureTask<Boolean> task : futureList) {
            count += task.get() == true ? 1 : 0;
        }
        System.out.println(count);
    }

    private static final String KEY_WORD = "Test";

    class WordMatchTask implements Callable<Boolean> {
        private File file;

        public WordMatchTask(File file) {
            this.file = file;
        }

        @Override
        public Boolean call() throws Exception {
            boolean found = false;
            try (Stream<String> stream = Files.lines(this.file.toPath(), StandardCharsets.UTF_8)) {
                found = stream.anyMatch(line -> line.contains(KEY_WORD));
            } catch (IOException e) {
                System.out.println(e.getStackTrace());
                logger.log(Level.FINE, "--------------Error ----------------");
            }
            return found;
        }
    }
}
