package pe.edu.pe.sopa.ws.publico;

import javax.xml.ws.Endpoint;


import pe.edu.upeu.soap.ws.daoImpl.ClienteDaoImpl;



public class ClientePublico {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:3030/soap/cliente", new ClienteDaoImpl());;
		System.out.println("Ejecutando......!");
	}
}
