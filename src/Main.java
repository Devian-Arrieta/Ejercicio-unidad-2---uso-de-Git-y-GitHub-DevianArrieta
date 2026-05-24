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

      if (opcion == 5){ // si es opción 5 cierra el programa
        System.out.println("Gracias por usar el programa");
        break;
      }

      else if (opcion > 5 || opcion <= 0) { // si ingresa un numero no invalido no continua el programa
        System.out.println("Opción invalida, eliga una de las 5 opciones mostrada");
        continue;
      }

      else { // si ingresa las opciones correctas continua

        System.out.println("Ingresa el primer número: "); // pide el 1 numero
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: "); // pide el 2 numero
        int num2 = teclado.nextInt();

        // se declaran las variables que se van a usar para el mensaje de respuesta
        double resultado = 0;
        String operacion = "", signo = "";

        if(opcion == 1){ // realiza la suma
          resultado = num1 + num2;
          operacion = "suma";
          signo = "+";
        }

        else if (opcion == 2) { // realiza la resta
          resultado = num1 - num2;
          operacion = "resta";
          signo = "-";
        }

        else if (opcion == 3) { // realiza la multiplicacion
          resultado = num1 * num2;
          operacion = "multiplicación";
          signo = "*";
        }

        else { // realiza la division

          if (num2 == 0){ // valida numeros validos para realizar la division
            System.out.println("No se puede dividir entre 0");
            continue;
          }

          else{
            resultado = (double)num1 / num2;
            operacion = "división";
            signo = "/";
          }
        }

        // mensajes de respuesta
        System.out.println("El resultado de la "+operacion+" "+num1+" "+signo+" "+num2+" es igual a: "+resultado+"\n");

        System.out.println("Presione ENTER para continuar o ingrese otro caracter para cerrar el programa: ");
        teclado.nextLine(); // limpia el salto de línea
        String opcion2 = teclado.nextLine();

        if (opcion2.isEmpty()){
          continue;
        }

        else{
          break;
        }
      }
    }
    catch (InputMismatchException e){ // catch por si ingresa algo invalido y el prograga no colapse
      System.out.println("Número errado y/o caracter invalido \n");
      teclado.nextLine();
    }
  }
}
