class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Persona persona=new Persona();
    if(persona.validarDni("13.634.783-5"))
    {
      System.out.println("Rut valido");
    }
    else{
      System.out.println("Rut no valido");
      
    }
  }
}