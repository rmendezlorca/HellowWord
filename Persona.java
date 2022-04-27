
class Persona
{
  private String rut;
  private String nombre;
  public Persona(){}
  boolean validarDni(String dni){
    this.rut=dni;
    System.out.println("El rut es ".concat(this.rut));
    boolean validacion=false;
   try 
	        {
				dni =  dni.toUpperCase();
				dni = dni.replace(".", "");
				dni = dni.replace("-", "");
				int rutAux = Integer.parseInt(dni.substring(0, dni.length() -1));
			 
				char dv = dni.charAt(dni.length() - 1);
				 
				int m = 0, s = 1;
				for (; rutAux != 0; rutAux /= 10) {
				s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
				}
				if (dv == (char) (s != 0 ? s + 47 : 75)) {
				validacion = true;
				}
				 
				} catch (java.lang.NumberFormatException e) {
				} catch (Exception e) {
				}
			return validacion;
		
}
}