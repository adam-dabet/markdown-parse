import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(4, 2+2);
    }
    @Test
    public void TestFile1() throws IOException {
        String contentsTest = Files.readString(Path.of("test1.md"));
        assertEquals(List.of("https://something.com", "some-page.html", "last-link.html"), MarkdownParse.getLinks(contentsTest));
    }

    @Test
    public void TestFile2() throws IOException {
        String contentsTest = Files.readString(Path.of("test2.md"));
        assertEquals(List.of("https://anything.com","another-page.html","a-page.html"), MarkdownParse.getLinks(contentsTest));
    }

}