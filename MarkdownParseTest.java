import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    /*/
    @Test
    public void addition() {
        assertEquals(4, 2+2);
    }
    @Test
    public void TestFile1() throws IOException {
        String contentsTest1 = Files.readString(Path.of("test1.md"));
        assertEquals(List.of("https://something.com", "some-page.html", "last-link.html"), MarkdownParse.getLinks(contentsTest1));
    }


    @Test

    public void TestFile2() throws IOException {
        String contentsTest = Files.readString(Path.of("test2.md"));
        assertEquals(List.of("https://anything.com","another-page.html","a-page.html"), MarkdownParse.getLinks(contentsTest));
    }
*/
    @Test
    public void TestNewFile1() throws IOException {
        String contents = Files.readString(Path.of("/Users/adamdabet/Documents/Github/markdown-parse/new-tests1.md"));
        assertEquals(List.of("`google.com","google.com","ucsd.edu"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void TestNewFile2() throws IOException {
        String contents = Files.readString(Path.of("/Users/adamdabet/Documents/Github/markdown-parse/new-tests2.md"));
        assertEquals(List.of("a.com(())","example.com"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void TestNewFile3() throws IOException {
        String contents = Files.readString(Path.of("/Users/adamdabet/Documents/Github/markdown-parse/new-tests3.md"));
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"), MarkdownParse.getLinks(contents));
    }

}