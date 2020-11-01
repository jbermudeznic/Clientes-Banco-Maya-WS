package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService(endpointInterface = "com.bancomaya.clientes.TarjetaDigitalService" )
public class TarjetaDigitalServiceImpl implements TarjetaDigitalService{

	private static List<TarjetaDigital> tarjetas=new ArrayList<TarjetaDigital>();
	
	static {
		TarjetaDigital tarjetaDemo=new TarjetaDigital();
		
		tarjetaDemo.setBanco("Banco MAYA");
		tarjetaDemo.setFechaVencimiento("01/01/2000");
		tarjetaDemo.setId(1);
		tarjetaDemo.setNumero("0000-0000-0000-0000");
		tarjetaDemo.setNumeroSeguridad("111");
		tarjetas.add(tarjetaDemo);
	}
	
	@Override
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta) {
	
		tarjeta.setId(tarjetas.size()+1);
		tarjetas.add(tarjeta);
		
		return tarjeta;
	}

	@Override	
	public List<TarjetaDigital> obtenerTarjetasDigitales() {
		
		return tarjetas;
		
	}

	@Override
	public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNombreCliente(String nombreCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
