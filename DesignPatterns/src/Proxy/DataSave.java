package Proxy;

import java.util.ArrayList;

public class DataSave implements ISave {

	@Override
	public void save(ArrayList datos) {

		if (ConnectionManager.hayConexion()) {
			new RemoteSave().save(datos);
		} else {
			new LocalSave().save(datos);
		}

	}

}
