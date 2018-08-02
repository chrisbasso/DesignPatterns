package Proxy;

import java.util.ArrayList;

public class LocalSave implements ISave {

	@Override
	public void save(ArrayList datos) {

		System.out.println("Guardado en disco");

	}

}
