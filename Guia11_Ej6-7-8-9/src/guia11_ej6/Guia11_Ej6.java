/*
EJERCICIO 6
Dado el método metodoA de la clase A, indique:

class A {
  public void metodoA() {
        sentencia_a1 
                sentencia_a2
        try {
            sentencia_a3 
                    sentencia_a4
        } catch (MioException e) {
            sentencia_a6
        }
        sentencia_a5
    }
}

a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?

1° Se ejecuta a1
2° Se ejecuta a2
3° Se ejecuta a3 y/o a4 (segun cual produzca al Excepcion)
4° Si alguno de ellos falla entra al Catch y se ejecuta por ultimo a6

b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

1° Se ejecuta a1
2° Se ejecuta a2
3° Se ejecuta a3
4° Se ejecuta a4
5° Se ejecuta a5

*******************************************************************************************************************************
EJERCICIO 7

Dado el método metodoB de la clase B, indique:
       class B {
            public void metodoB() {
                sentencia_b1
                try {
                    sentencia_b2
                } catch (MioException e) {
                    sentencia_b3
                } finally 
                    sentencia_b4
                }
            }
    }
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
1° Se ejecuta b1
2° Se ejecuta b2 y se produce la excepcion
3° Se ejecuta b3 ya que ingresa al catch
4° Se ejecuta b4 ya que sin importar si ingresa al catch o no es finally e igual se ejecuta
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
1° Se ejecuta b1
2° Se ejecuta b2
3° Se ejecuta b4 ya que sin importar si ingresa al catch o no es finally e igual se ejecuta

*******************************************************************************************************************************
EJERCICIO 8

Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
        class Uno {

            private static int metodo() {
                int valor = 0;
                try {
                    valor = valor + 1; // 0+1=1
                    valor = valor + Integer.parseInt(”42”); // 1+42=43
                    valor = valor + 1; // 43+1= 44
                    System.out.println(”Valor final del try :” +valor ) ; 
} catch (NumberFormatException e) {
                        Valor = valor + Integer.parseInt( ”42”);
System.out.println(“Valor final del catch  :” +valor );
}finally {
                                    valor = valor + 1; // 43+1= 44
                                    System.out.println(”Valor final del finally: ” + valor) ;
}
                        valor = valor + 1; // 44+1=45
                        System.out.println(
                        ”Valor antes del return: ” + valor
                        ) ;
return valor;
                    }

            public static void main(String[] args) {
                try {
                    System.out.println(metodo());
                } catch (Exception e) {
                    System.err.println(”Excepcion en metodo() ”) ;
e.printStackTrace();
                }
            }
        }
--------------------------------------------------------------------------------------------------------------------------------
EN LA CLASE UNO: Desde el Main, luego de ejecutar el codigo se imprimira en pantalla:

Valor final del try: 43
Valor final del finally: 44
Valor antes del return: 45

--------------------------------------------------------------------------------------------------------------------------------

        class Dos {

            private static int metodo() {
                int valor = 0;
                try {
                    valor = valor + 1;
                    valor = valor + Integer.parseInt(”W ”);
valor = valor + 1;
                    System.out.println(”Valor final del try : ” +valor
                     ) ;
} catch (NumberFormatException e) {
                        valor = valor + Integer.parseInt( ”42”); //1+42=43
System.out.println(”Valor final del catch  : ” +valor ) ;
}finally {
                                    valor = valor + 1; // 43+1=44
                                    System.out.println(”Valor final del finally: ” + valor) ;
}
                        valor = valor + 1; // 43+1=44
                        System.out.println(
                        ”Valor antes del return: ” + valor
                        ) ;
return valor;
                    }


            public static void main(String[] args) {
                try {
                    System.out.println(metodo());
                } catch (Exception e) {
                    System.err.println( ” Excepcion en metodo() ” ) ;
e.printStackTrace();
                }
            }
        }
--------------------------------------------------------------------------------------------------------------------------------
EN LA CLASE DOS: Desde el Main, luego de ejecutar el codigo se imprimira en pantalla:

Valor final del catch  : 43
Valor final del finally: 44
Excepcion en metodo() 
Por ultimo: e.printStackTrace() mostrara la pila de llamados que llevo a la excepcion.
--------------------------------------------------------------------------------------------------------------------------------
        class Tres {

            private static int metodo() {
                int valor = 0;
                try {
                    valor = valor + 1;
                    valor = valor + Integer.parseInt(”W ”);
                    valor = valor + 1;
                    System.out.println(”Valor final del try : ” +valor );
                } catch (NumberFormatException e) {
                        valor = valor + Integer.parseInt(”W ”);
                        System.out.println(”Valor final del catch  : ” +valor);
                    }finally{
                                    valor = valor + 1;
                                    System.out.println(”Valor final del finally:” + valor);
                                }
                        valor = valor + 1;
                        System.out.println(
                        ”Valor antes del return: ” + valor ) ;
return valor;
                    }


            public static void main(String[] args) {
                try {
                    System.out.println(metodo());
                } catch (Exception e) {
                    System.err.println( ”Excepcion en metodo() ” ) ;
e.printStackTrace();
                }
            }
        }

--------------------------------------------------------------------------------------------------------------------------------
EN LA CLASE TRES: Desde el Main, luego de ejecutar el codigo se imprimira en pantalla:

Valor final del finally: 2
Excepcion en metodo() 
Por ultimo: e.printStackTrace() mostrara la pila de llamados que llevo a la excepcion.
--------------------------------------------------------------------------------------------------------------------------------
*******************************************************************************************************************************
EJERCICIO 9
Dado el método metodoC de la clase C, indique:

     class C {

            void metodoC() throws TuException {
                sentencia_c1
                try {
                    sentencia_c2 
                    sentencia_c3
                } catch (MioException e) {
                    sentencia_c4
                } catch (TuException e) {
                    sentencia_c5
                    throw (e)
                } finally 
                    sentencia_c6
                }
            }

a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
1° Se ejecuta c1
2° Se ejecuta c2 y/o c3 (segun cual produzca al Excepcion)
3° Se ejecuta c4
4° Se ejecuta c6

b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
1° Se ejecuta c1
2° Se ejecuta c2 
3° Se ejecuta c3
4° Se ejecuta c6

c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
1° Se ejecuta c1
2° Se ejecuta c2 y/o c3 (segun cual produzca al Excepcion)
3° Se ejecuta c5
4° Se ejecuta el throw(e)
5° Se ejecuta c6

 */
package guia11_ej6;

public class Guia11_Ej6 {

    public static void main(String[] args)  {
        // TODO code application logic here  
    }
}