package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;

@Service
public class ProductoService implements IProductoService {

	public static final List<Producto> LIST_PRODUCTO=new ArrayList<>();
	
	
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return ProductoService.LIST_PRODUCTO;
	}

	@Override
	public void save(Producto producto) {
		// TODO Auto-generated method stub
		ProductoService.LIST_PRODUCTO.add(producto);
	}
        
        

    @Override
    public void eliminar(int id) {
       ProductoService.LIST_PRODUCTO.remove(id);
    }

}
