package ejemplo2.interfaces;

import ejemplo2.dto.JugueteDTO;

import java.io.IOException;
import java.util.List;

public interface IProducto {
    JugueteDTO findById(int id);
    List<JugueteDTO> findAll() throws IOException, ClassNotFoundException;
    void save(JugueteDTO producto) throws IOException;
    void update(JugueteDTO producto) throws IOException;
    void delete(JugueteDTO producto) throws IOException;
}
