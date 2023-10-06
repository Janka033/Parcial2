package ejemplo2.service;


import ejemplo2.dto.JugueteDTO;
import ejemplo2.interfaces.IProducto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements IProducto {
    private List<JugueteDTO> productos;

    public ProductoServiceImpl() throws IOException, ClassNotFoundException {
        productos = new ArrayList<>();
    }

    @Override
    public JugueteDTO findById(int id) {
        return productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<JugueteDTO> findAll() throws IOException, ClassNotFoundException {
        productos = (List<JugueteDTO>) ObjectSerializer.readObjectFromFile("productos.ax");
       return productos;
    }

    @Override
    public void save(JugueteDTO producto) throws IOException {
        productos.add(producto);
        ObjectSerializer.writeObjectToFile(productos, "productos.ax");
    }

    @Override
    public void update(JugueteDTO producto) throws IOException {
        JugueteDTO oldProducto = findById(producto.getId());
        if (oldProducto != null) {
            productos.remove(oldProducto);
            productos.add(producto);
            ObjectSerializer.writeObjectToFile(productos, "productos.ax");
        }
    }

    @Override
    public void delete(JugueteDTO producto) throws IOException {
        productos.remove(producto);
        ObjectSerializer.writeObjectToFile(productos, "productos.ax");
    }
}

