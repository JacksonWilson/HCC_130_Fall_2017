package labs.lab16;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {
    public static void main(String[] args) {
        try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
            double p1x = keyReader.readDouble("Enter p1 x coord: ");
            double p1y = keyReader.readDouble("Enter p1 y coord: ");
            double p2x = keyReader.readDouble("Enter p2 x coord: ");
            double p2y = keyReader.readDouble("Enter p2 y coord: ");
            
            Segment segment = new Segment(p1x, p1y, p2x, p2y);
            System.out.println("\nSegment distance: " + segment.calc_distance());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}