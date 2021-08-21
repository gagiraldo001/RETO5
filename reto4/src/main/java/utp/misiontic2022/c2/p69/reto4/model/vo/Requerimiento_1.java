package utp.misiontic2022.c2.p69.reto4.model.vo;

public class Requerimiento_1 {
    // Operaciones de la clase requerimiento 1 -- su código
    // Atribuos
    private String fechaCompra;
    private Integer codCompra;
    private String nombreProveedor;
    private String pagado;

    public Requerimiento_1(){

    }

    public Requerimiento_1(String fechaCompra, Integer codCompra, String nombreProveedor, String pagado){
        this.setFechaCompra(fechaCompra);
        this.setCodCompra(codCompra);
        this.setNombreProveedor(nombreProveedor);
        this.setPagado(pagado);
    }
    
    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }
}
