package clsprocye;

public class Usuario {

	
	// Esta clases se utiliza para obtener los datos y compartilos hacer hacer el login.
	    private String Usuario; 
		private String contraseña;
		
		
		//Construtor de la clase Usuario
		public Usuario(String usuario, String contraseña) {
			
			this.Usuario = usuario;
			this.contraseña = contraseña;
					}
       //Metos setters y getters: 
		public String getContraseña() {
			return contraseña;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
		public Usuario() {
			// TODO Auto-generated constructor stub
		}
		public String getUsuario() {
			return Usuario;
		}
		public void setUsuario(String usuario) {
			Usuario = usuario;
		}
				
		
}


