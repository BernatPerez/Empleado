/**
 * Clase Empleado contiene información de cada empleado
 * @version 15.11
 * @author Bernat Pérez, <a href= "mailto:perezroig.bernat@mail.com"> mail me </a> 
 */
public class Empleado {
  private String nombre;
  private String apellido;
  private int edad;
  private double salario;
  
  //Metodos publicos
  /**
   * Suma un plus de XX euros al salario del empleado si el empleado tiene mas de ZZ años
omite esta línea (sustituye la XX por tu año de nacimiento y la ZZ por tu edad )
omite esta línea (Si naciste en el 80 y tu edad es de 40 años sería:...)
   * @param sueldoPlus  Cantidad en euros que se suma al salario
   * @return <ul> 
   *        <li> True: Se suma el plus al sueldo </li>
   *        <li> False: No se suma el plus al sueldo </li>
   *        </ul>
   */
  public boolean plus (double sueldoPlus){
    boolean aumento=false;
    if (edad>40 && compruebaNombre()){
        salario+=sueldoPlus;
        aumento=true;
    }
    return aumento;
  }
  
  //Metodos privados
  private boolean compruebaNombre(){
    if(nombre.equals("")){
        return false;
    }
    return true;
  }
 /**
  * Constructor por defecto
  */
  //Constructores
  public Empleado(){
    this ("", "", 0, 0);
  }
  /**
   * Constructor con 4 parámetros
   * 
   * @param nombre Nombre del empleado
   * @param apellido nombre del empleado
   * @param edad edad del empleado
   * @param salario salario del empleado
   */
  public Empleado(String nombre, String apellido, int edad, double salario){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.salario=salario;
  }
   
}