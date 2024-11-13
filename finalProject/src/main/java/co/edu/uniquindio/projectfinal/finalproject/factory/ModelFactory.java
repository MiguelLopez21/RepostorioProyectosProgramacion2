package co.edu.uniquindio.projectfinal.finalproject.factory;

import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.ProductoDTO;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.VendedorDTO;
import co.edu.uniquindio.projectfinal.finalproject.mapping.mappers.MarketPlaceMappingImpl;
import co.edu.uniquindio.projectfinal.finalproject.model.MarketPlace;
import co.edu.uniquindio.projectfinal.finalproject.model.Vendedor;
import co.edu.uniquindio.projectfinal.finalproject.service.IModelFactoryServices;
import org.controlsfx.control.PropertySheet;

import java.util.List;

public class ModelFactory implements IModelFactoryServices {

    private static ModelFactory instance;
    private static MarketPlace marketPlace;
    private static MarketPlaceMappingImpl mapping;

    private ModelFactory() {
        inicializarDatos();
        mapping = new MarketPlaceMappingImpl();

    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }
    private void inicializarDatos() {
        MarketPlace m = new MarketPlace();
        Vendedor v = new Vendedor("costeña", "sapaperra", "1234", "000", "user", "123", "01");

    }

    public static void setInstance(ModelFactory instance) {
        ModelFactory.instance = instance;
    }

    public static MarketPlaceMappingImpl getMapping() {
        return mapping;
    }

    public static void setMapping(MarketPlaceMappingImpl mapping) {
        ModelFactory.mapping = mapping;
    }

    public List<Vendedor> getListaContactos(String id){
        return marketPlace.getListaContactos(id);
    }

    public List<ProductoDTO> getListaProductosDto(String id) {
        return mapping.productosToProductosDto(marketPlace.getListaProductosVendedor(id));
    }
}
