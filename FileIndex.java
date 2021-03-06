import java.io.File;

public class FileIndex {
    public static void main(String[] args) {
        ST<String, SET<File>> st = new ST<String, SET<File>>();

        for (String filename : args) {
            File file = new File(filename);
            In in = new In(file);
            while (!in.isEmpty()) {
                String key = in.readString();
                if (!st.contains(key)) {
                    st.put(word, new SET<File>());
                }
                SET<File> set = st.get(key);
                set.add(file);
            }
        }
        while (!StdIn.isEmpty()) {
            String query = StdIn.readString();
            StdOut.println(st.get(query));
        }
    }
}
