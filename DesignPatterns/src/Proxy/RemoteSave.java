package Proxy;

import java.util.ArrayList;

public class RemoteSave implements ISave{

	@Override
	public void save(ArrayList datos) {
		System.out.println("Guardado en servidor remoto");
		
	}

}
