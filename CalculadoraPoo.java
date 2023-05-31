/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.poo;
import java.util.Scanner;

public class CalculadoraPoo {
@SuppressWarnings("UnusedAssignment")    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       System.out.println("=======================");
       CalculadoraEspecial calculadoraEspecial;
       calculadoraEspecial = new CalculadoraEspecial("Calculadora Especial", "verde", 5, "123abc", "kimberly");
       boolean salir = false;
       int opcion, opcioncalculadora, num1,  num2;      
    
       calculadoraEspecial.mostrarDatos();
       System.out.println("=======================");
       do{      
           System.out.println("");
           System.out.println("hola, espero estes bien puedes seleccionar tu calculadora preferida.");
           System.out.println("Mi Nombre es kim!");
           System.out.println(" seleccione la calculadora que va a  utilizar");
           System.out.println("");
           System.out.println("=======================");
           System.out.println("=======================");
           System.out.println("1. Calculadora Simple");
           System.out.println("2. Calculadora Especial");
           System.out.println("3. Salir");
           System.out.println("=======================");
           System.out.println("=======================");           
           opcioncalculadora = sn.nextInt();          
           switch(opcioncalculadora){
               case 1:
                  System.out.println("");
                  System.out.println("=======================");
                  System.out.println("=======================");
                  System.out.println("1. resta");
                  System.out.println("2. suma");
                  System.out.println("3. verificar numero primo");
                  System.out.println("4. raiz cuadrada");
                  System.out.println("5. dividir");
                  System.out.println("6. Multiplicar");
                  System.out.println("7. Salir");
                  System.out.println("Selecciona una opcion");
                  System.out.println("=======================");   
                  System.out.println("=======================");

                  opcion = sn.nextInt();                   
              switch(opcion){
                  case 1:
                      System.out.println("coloque el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("coloque el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("su resultado de la resta es = " + calculadoraEspecial.restar(num1, num2));
                      break;
                  case 2:
                      System.out.println("coloque el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("coloque el segundo numero: ");
                      num2 = sn.nextInt();                     
                      System.out.println("su resultado de la suma es = " + calculadoraEspecial.sumar(num1, num2));
                      break;
                  case 3:
                      System.out.println("Ingrese el numero: ");
                      num1 = sn.nextInt();
                      System.out.println("Es primo? = " + calculadoraEspecial.esPrimo(num1));
                      break;
                  case 4:
                      System.out.println("Ingrese su numero: ");
                      num1 = sn.nextInt();
                      System.out.println("su resultado de la raíz cuadrada es = " + calculadoraEspecial.raizCuadrada(num1));
                      break; 
                  case 5:
                      System.out.println("coloque el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("coloque el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("su resultado de la división es = " + calculadoraEspecial.dividir(num1, num2));
                      break;
                  case 6:
                      System.out.println("coloque el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("coloque el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("su resultado de la multiplicacion es = " + calculadoraEspecial.multiplicar(num1, num2));
                      break;
                  case 7:
                      salir=true;
                  default:
                      System.out.println("Solo números entre 1 y 7");     
                }
              break;          
              case 2:
                    System.out.println("");
                    System.out.println("=======================");
                    System.out.println("=======================");
                    System.out.println("1. Calcular logaritmo");
                    System.out.println("2. Calcular raiz cubica");
                    System.out.println("3. Generar numero aleatorio");
                    System.out.println("4. Calcular tangente");
                    System.out.println("5. Calcular coseno");
                    System.out.println("6. Calcular seno");
                    System.out.println("7. Calcular potencia");
                    System.out.println("8. Salir");
                    System.out.println("Selecciona una opcion");
                    System.out.println("=======================");
                    System.out.println("=======================");
                    opcion = sn.nextInt();
                    switch (opcion) {
                        case 1: {
                            System.out.println("Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del logaritmo es = " + calculadoraEspecial.calcularLogaritmo(num1));
                            break;
                        }
                        case 2:{
                            System.out.println("Ingrese su numero: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la raiz cubica es = " + calculadoraEspecial.calcularRaizCubica(num1));
                            break;
                            
                        }
                        case 3: {
                            System.out.println("Ingrese su limite superior: ");
                            num1 = sn.nextInt();
                            System.out.println("Numero aleatorio generado = " + calculadoraEspecial.generarNumeroAleatorio(num1));
                            break;
                            
                        }
                        case 4: {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la tangente es = " + calculadoraEspecial.calcularTangente(num1));
                            break;
                            
                        }
                        case 5: {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del coseno es = " + calculadoraEspecial.calcularCoseno(num1));
                            break;
                        }
                        case 6:{
                           System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del seno es = " + calculadoraEspecial.calcularSeno(num1));
                            break;
                        }
                        case 7: {
                           System.out.println("coloque la base: ");
                            num1 = sn.nextInt();
                            System.out.println("coloque el exponente: ");
                            num2 = sn.nextInt();
                            System.out.println("El resultado de la potencia es = " + calculadoraEspecial.calcularPotencia(num1, num2));
                            break;
                        }
                         case 8: 
                            salir = true;
                         default:
                    }
                break;   
                case 3:
                    salir=true;
            }  
        }   
        while(!salir);
       System.out.println(" Fin!");        
    }
}