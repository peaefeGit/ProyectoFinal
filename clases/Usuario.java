/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Usuario {
   private String nombre;
   private String apellido;
   private String user;
   private String Password;
   
   public Usuario( String user, String pass){
       
       this.user = user;
       this.Password = pass;
   }
   
   public void setNombre(String x){
       this.nombre=x;
   }
   public void setApellido(String x){
       this.apellido=x;
   }
   public void setUser(String x){
       this.user=x;
   }
   public void setPassword(String x){
       this.Password=x;
   }
   
   public String getNombre (){
       return this.nombre;
   }
   public String getApellido (){
       return this.apellido;
   }
   public String getUser (){
       return this.user;
   }
   public String getPassword (){
       return this.Password;
   }
   
}
