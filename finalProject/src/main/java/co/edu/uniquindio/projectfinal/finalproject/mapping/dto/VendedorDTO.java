package co.edu.uniquindio.projectfinal.finalproject.mapping.dto;


import java.util.List;

public class VendedorDTO extends UsuarioDTO {
    private String IdVendedor;
    private List<VendedorDTO> listaContactos;
    private List<ProductoDTO> listaProductos;
    private MuroDTO muro;

    public VendedorDTO(String nombre, String apellido, String cedula, String direccion, String usuario, String password, String idVendedor) {
        super(nombre, apellido, cedula, direccion, usuario, password);
        this.IdVendedor = idVendedor;
    }

    public String getIdVendedor() {
        return IdVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        IdVendedor = idVendedor;
    }

    public MuroDTO getMuro() {
        return muro;
    }

    public void setMuro(MuroDTO muro) {
        this.muro = muro;
    }

    public List<VendedorDTO> getListaContactosDto() {
        return listaContactos;
    }

    public void setListaContactosDto(List<VendedorDTO> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public List<ProductoDTO> getListaProductosDto() {
        return listaProductos;
    }

    public void setListaProductosDto(List<ProductoDTO> listaProductos) {
        this.listaProductos = listaProductos;
    }
}

