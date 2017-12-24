package labs.lab19;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {
	public static void main(String args []) {
		try (KeyboardReader keyReader = new KeyboardReader(System.in)) {
			DecayingMaterial dm = new RadioactiveMaterial(keyReader.readDouble("Enter volume: "));
			DecayingMaterial.identifyProcess();
			dm.decay();
			dm.printVolume();
			RadioactiveMaterial.identifyProcess();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}