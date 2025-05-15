package cours_2.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private BufferedReader br;

    public ReadFile(String fileName) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(fileName));

    }
    public String readNextLine() throws IOException {
        return br.readLine();
    }

    public void close() throws IOException {
        br.close();
    }
}
