package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {

    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/main/resources/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());

        List<String> lines = Files.readAllLines(path, charset);

        int line = lines.size();
        int characters = 0;
        int words = 0;

        for (String count : lines) {
            characters += count.length();
            words += counter(count);
        }

        System.out.println("Lines = " + line);
        System.out.println("Words = " + words);
        System.out.println("Characters = " + characters);

    }

    public static int counter(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetterOrDigit(line.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

////////////////NullPointeru met////////////////////////