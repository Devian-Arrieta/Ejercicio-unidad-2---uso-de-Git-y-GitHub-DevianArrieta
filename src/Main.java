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
        System.out.println("Ingresa el primero número: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();

        double resultado = 0;
        String operacion = "", signo = "";

        if(opcion == 1){
          resultado = num1 + num2;
          operacion = "suma";
          signo = "+";
        }
        else if (opcion == 2) {
          resultado = num1 - num2;
          operacion = "resta";
          signo = "-";
        }
        else if (opcion == 3) {
          resultado = num1 * num2;
          operacion = "multiplicación";
          signo = "*";
        }
        else if (opcion == 4) {
          resultado = num1 / num2;
          operacion = "división";
          signo = "/";
        }

        System.out.println("El resultado de la "+operacion+" "+num1+" "+signo+" "+num2+" es igual a: "+resultado+"\n");

        System.out.println("Preione ENTER para continuar o ingrese otro caracter para cerrar el programa: ");
        String opcion2 = teclado.nextLine();

        if (opcion2 == ""){
          continue;
        }
        else{
          break;
        }
      }
    }
    catch (Exception e){
      System.out.println("Número errado y/o caracter invalido");
      break;
    }
  }
}
