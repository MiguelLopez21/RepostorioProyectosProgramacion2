package co.edu.uniquindio.projectfinal.finalproject.mapping.mappers;

import co.edu.uniquindio.projectfinal.finalproject.factory.ModelFactory;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.*;
import co.edu.uniquindio.projectfinal.finalproject.model.*;
import co.edu.uniquindio.projectfinal.finalproject.service.IMarketPlaceMapping;

import java.util.List;

public class MarketPlaceMappingImpl implements IMarketPlaceMapping{
    ModelFactory modelFactory;

    @Override
    public UsuarioDTO usuarioToUsuarioDto(Usuario usuario) {
        Vendedor vendedor = (Vendedor) usuario;
        if (usuario instanceof Vendedor) {
            VendedorDTO vendedorDto = new VendedorDTO(
                    vendedor.getNombre(),
                    vendedor.getApellido(),
                    vendedor.getCedula(),
                    vendedor.getDireccion(),
                    vendedor.getUsuario(),
                    vendedor.getPassword(),
                    vendedor.getIdVendedor());
            return vendedorDto;

        } else if (usuario instanceof Administrador) {
            Administrador administrador = (Administrador) usuario;
            AdministradorDTO administradorDto = new AdministradorDTO(administrador.getNombre(),
                    administrador.getApellido(),
                    administrador.getCedula(),
                    administrador.getDireccion(),
                    administrador.getUsuario(),
                    administrador.getPassword(),
                    administrador.getApellido());
            return administradorDto;



        }
        return null;

    }

    public Usuario usuarioDtoToUsuario(UsuarioDTO usuarioDto) {
        if(usuarioDto instanceof VendedorDTO){
            VendedorDTO vendedorDto = (VendedorDTO) usuarioDto;
            Vendedor vendedor = new Vendedor();
            vendedor.setIdVendedor(vendedorDto.getIdVendedor());
            vendedor.setNombre(vendedorDto.getNombre());
            vendedor.setApellido(vendedorDto.getApellido());
            vendedor.setCedula(vendedorDto.getCedula());
            vendedor.setDireccion(vendedorDto.getDireccion());
            vendedor.setUsuario(vendedorDto.getUsuario());
            vendedor.setPassword(vendedorDto.getPassword());

            vendedor.setListaProductos(productosDtoToProductos(modelFactory.getListaProductosDto(vendedorDto.getIdVendedor())));
            vendedor.setMuro(muroDtoToMuro(vendedorDto.getMuro()));
            vendedor.setListaContactos(modelFactory.getListaContactos(vendedorDto.getIdVendedor()));

            return vendedor;

        }else if(usuarioDto instanceof AdministradorDTO){
            AdministradorDTO administradorDto = (AdministradorDTO) usuarioDto;
            Administrador admin = new Administrador();
            admin.setIdAdmin(administradorDto.getIdAdmin());
            admin.setNombre(administradorDto.getNombre());
            admin.setApellido(administradorDto.getApellido());
            admin.setCedula(administradorDto.getCedula());
            admin.setDireccion(administradorDto.getDireccion());
            admin.setUsuario(administradorDto.getUsuario());
            admin.setPassword(administradorDto.getPassword());
            return admin;
        }
        return null;
    }

    @Override
    public Publicacion publicacionDtoToPublicacion(PublicacionDTO publicacion) {
        Publicacion publicacionn = new Publicacion();
        publicacionn.setFechaPublicacion(publicacion.getFechaPublicacion());
        publicacionn.setHoraPublicacion(publicacion.getHoraPublicacion());
        publicacionn.setProducto(productoDtoToProducto(publicacion.getProducto()));
        publicacionn.setDescripcion(publicacion.getDescripcion());

        publicacionn.setListaComentarios(modelFactory.getListaComentarios(publicacion.get(), publicacion));
        return publicacionn;
    }

    @Override
    public PublicacionDTO publicacionToPublicacionDto(Publicacion publicacion) {
        return null;
    }

    @Override
    public ProductoDTO productoToProductoDto(Producto producto) {
        return null;
    }

    @Override
    public Producto productoDtoToProducto(ProductoDTO productoDto) {
        return null;
    }

    @Override
    public Mensaje mesajeDtoToMensaje(MensajeDTO mensaje) {
        return null;
    }

    @Override
    public MensajeDTO mensajeToMensajeDto(Mensaje mensaje) {
        return null;
    }

    @Override
    public Comentario comentarioDtoToComentario(ComentarioDTO comentario) {
        return null;
    }

    @Override
    public ComentarioDTO comentarioToComentarioDto(Comentario comentario) {
        return null;
    }

    @Override
    public Muro muroDtoToMuro(MuroDTO muro) {
        return null;
    }

    @Override
    public MuroDTO muroToMuroDto(Muro muro) {
        return null;
    }

    @Override
    public List<VendedorDTO> VendedoresToVendedoresDto(List<Vendedor> vendedores) {
        return List.of();
    }

    @Override
    public List<Vendedor> VendedoresDtoToVendedores(List<VendedorDTO> vendedores) {
        return List.of();
    }

    @Override
    public List<PublicacionDTO> publicacionesToPublicacionesDto(List<Publicacion> publicaciones) {
        return List.of();
    }

    @Override
    public List<Publicacion> publicacionesDtoToPublicaciones(List<PublicacionDTO> publicacionesDto) {
        return List.of();
    }

    @Override
    public List<ProductoDTO> productosToProductosDto(List<Producto> productos) {
        return List.of();
    }

    @Override
    public List<Producto> productosDtoToProductos(List<ProductoDTO> productosDto) {
        return List.of();
    }

    @Override
    public List<Comentario> comentariosDtoToComentarios(List<ComentarioDTO> comentariosDto) {
        return List.of();
    }

    @Override
    public List<ComentarioDTO> comentariosToComentariosDto(List<Comentario> comentarios) {
        return List.of();
    }

    @Override
    public List<Mensaje> mensajesDtoToMensajes(List<MensajeDTO> mensajesDto) {
        return List.of();
    }

    @Override
    public List<MensajeDTO> mensajeToMensajesDto(List<Mensaje> mensajes) {
        return List.of();
    }
}
