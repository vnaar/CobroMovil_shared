package com.softdesignermonteria.cobromovil.clases;

public class ModelClientes {
		private String clientes_id;
	    private String nombre;
	    private String direccion;
	    private String telefono;
	    
	    
	    
	    public ModelClientes(String clientes_id, String nombre,
				String direccion, String telefono) {
			super();
			this.clientes_id = clientes_id;
			this.nombre = nombre;
			this.direccion = direccion;
			this.telefono = telefono;
		}
	    
	    
		public String getClientes_id() {
			return clientes_id;
		}
		public void setClientes_id(String clientes_id) {
			this.clientes_id = clientes_id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
}

