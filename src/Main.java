void main() {
  Scanner teclado = new Scanner(System.in);

  System.out.println("CALCULADORA");

  while (true){

    try{
      System.out.println("Bienvenid@ - ¿Que operación va a realizar?");
      System.out.println(
              "1. Suma \n" +
              "2. Resta \n" +
              "3. Multipliación \n" +
              "4. División \n" +
              "5. Cerrar Programa");

      System.out.print("\nOpción: ");
      int opcion = teclado.nextInt();

      if (opcion == 5){
        System.out.println("Gracias por usar el programa");
        break;
      }
      else if (opcion > 5) {
        System.out.println("Opción invalida, eliga una de las 5 opciones mostrada");
        continue;
      }
      else {
        System.out.println("continuará...");
      }
    }
    catch (Exception e){
      System.out.println("Número errado y/o caracter invalido");
      break;
    }
  }
}
