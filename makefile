test: MarkdownParseTest.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest


MarkdownParseTest.class: MarkdownParseTest.class MarkdownParse.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java


MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

	
