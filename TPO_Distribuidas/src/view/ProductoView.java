package view;

public class ProductoView {

	private int identificador;
	private SubRubroView subRubro;
	private RubroView rubro;
	private String nombre;
	private String marca;
	private String codigoBarras;
	private float precio;
	
	public ProductoView(int identificador, SubRubroView subRubro, RubroView rubro, String nombre, String marca, String codigoBarras, float precio) {
		this.identificador = identificador;
		this.subRubro = subRubro;
		this.rubro = rubro;
		this.nombre = nombre;
		this.marca = marca;
		this.codigoBarras = codigoBarras;
		this.precio = precio;
	}
	
	//Constructor vacío, agregado para poder llamar al ObjectMapper en el HomeController.
	public ProductoView() {}

	public int getIdentificador() {
		return identificador;
	}

	public SubRubroView getSubRubro() {
		return subRubro;
	}

	public RubroView getRubro() {
		return rubro;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMarca() {
		return marca;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public float getPrecio() {
		return precio;
	}
	
	public String toString(){
		return nombre + " " + codigoBarras;
	}
	
}
