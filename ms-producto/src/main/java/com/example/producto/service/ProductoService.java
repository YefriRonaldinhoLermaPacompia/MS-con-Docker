package com.example.producto.service;


import com.example.producto.entity.Producto;

import java.util.List;
import java.util.Optional;



public interface ProductoService {

    List<Producto> listar();

    Producto guardar(Producto producto);

    Producto actualizar(Producto producto);

    Optional<Producto> listarPorId(Integer id);

    void eliminarPorId(Integer id);
}