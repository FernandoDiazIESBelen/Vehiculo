
package vehiculo;

/**
 * 
 * @author Fernando Diaz Carrasco
 * @since 28/04/2024
 * @version 1.0
 */

public class miVehiculoFDC2324 {
    /**
     * atributo que indica el nombre del vehiculo
     */
    private String nombre;
    /**
     * atributo que indica el precio del vehiculo
     */
    private double precio;
    /**
     * atributo que indica el precioIva del vehiculo
     */
    private double precioIVA;
    /**
     * atributo que indica el stock del vehiculo
     */
    private int stock;

    /**
     * Construtor vacío
     */
    public miVehiculoFDC2324 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    
    /**
     * Constructor con parametros
     * 
     * @param nom parametro que indica el nombre del vehiculo
     * @param precio parametro que indica el precio del vehiculo
     * @param stock parametro que indica el stock del vehiculo
     */
    public miVehiculoFDC2324 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    
    /**
     *  Método para asignar el nombre del vehiculo
     * 
     * @param nom parametro para asignar el nombre
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que me devuelve el nombre del vehiculo
     * 
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * 
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * 
     * @param cantidad parametro indica cantidad del producto
     * @throws Exception 
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    /**
     * Metodo para vender
     * 
     * @param cantidad parametro para la cantidad para vender
     * @throws Exception 
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Metodo para seleccionar el atributo nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo de acceso para el atributo nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para seleccionar el atributo precio
     * @return 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo de acceso para el atributo PRECIO
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para seleccionar el atributo precioIva
     * @return 
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Metodo de acceso para el atributo precioIVA
     * @param precioIVA 
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Metodo para seleccionar el atributo stock
     * @return 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Metodo de acceso para el atributo stock
     * @param stock 
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    

