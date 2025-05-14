package com.perfulandia.productoservice.service;

import com.perfulandia.productoservice.model.Producto;
import com.perfulandia.productoservice.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repo;
    public ProductoService(ProductoRepository repo){
        this.repo = repo;
    }

    //listar
    public List<Producto> listar(){
        return repo.findAll();
    }

    //guardar
    public Producto guardarProducto(Producto prod){
        return repo.save(prod);
    }

    //buscar x id
    public Producto buscarPorId(long id){
        return repo.findById(id).orElse(null);
    }

    //eliminar x id
    public void eliminarPorId(long id){
        repo.deleteById(id);
    }
}
