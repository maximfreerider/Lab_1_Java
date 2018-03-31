import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EquipmentWriter {
            public void writeToFile (List<Equipment> equipments) {
                File csvText = new File("Text.csv");
                try (FileWriter fileWriter = new FileWriter(csvText)) {
                    for (Equipment equipment : equipments) {
                        fileWriter.write(equipment.toCSV() + "\n");
                        fileWriter.write(equipment.getHeaders() + "\n");
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
        }
}
