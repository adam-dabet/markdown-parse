import static org.junit.Assert.*;
<<<<<<< HEAD
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;


//To compile/run:
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks1() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://something.com");
        linkTester.add("some-page.html");

        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks2() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://something.com");
        linkTester.add("https://something.com");

        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks3() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://youtube.com");

        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks4() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://random.com");

        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks5() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();

        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks6() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("something.com");

        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testGetLinks7() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        //linkTester.add("something.com");

        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
        System.out.println("test change 2");
    }

    @Test
    public void TestNewFile1() throws IOException {
        String contents = Files.readString(Path.of("/Users/adamdabet/Documents/Github/markdown-parse3.0/new-tests1.md"));
        assertEquals(List.of("`google.com","google.com","ucsd.edu"), MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void TestNewFile2() throws IOException {
        String contents = Files.readString(Path.of("/Users/adamdabet/Documents/Github/markdown-parse3.0/new-tests2.md"));
        assertEquals(List.of("a.com", "a.com(())","example.com"), MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void TestNewFile3() throws IOException {
        String contents = Files.readString(Path.of("/Users/adamdabet/Documents/Github/markdown-parse3.0/new-tests3.md"));
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"), MarkdownParse.getLinks(contents));
    }
=======

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

>>>>>>> 64425688bd95b99d11ef687da08a58c4cd762fec
}