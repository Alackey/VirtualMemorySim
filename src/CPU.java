import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CPU {
    private List<Address> addresses;

    public CPU (String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            addresses = new ArrayList<>();

            // Add all address to addresses array
            int i = 0;
            while (i < lines.size()) {
                int prefix = Integer.parseInt(lines.get(i));

                if (prefix == 0) {
                    addresses.add(new Address(Integer.parseInt(lines.get(i)), lines.get(i+1)));
                    i += 2;
                } else {
                    addresses.add(new Address(Integer.parseInt(lines.get(i)), lines.get(i+1), Integer.parseInt(lines.get(i+2))));
                    i += 3;
                }
            }

            for (Address a : addresses) {
                System.out.println(a);
            }

            // Pass addresses to MMU
        } catch (IOException e) {
            System.out.println("Invalid file path.");
        }
    }
}
