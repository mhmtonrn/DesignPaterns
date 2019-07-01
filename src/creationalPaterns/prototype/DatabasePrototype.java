package creationalPaterns.prototype;
/**
 * 
 * 
 * @author mehmet
 */
public abstract class DatabasePrototype implements Cloneable {

   private String corporate;
   private String name;
   private int port;
   
   public String getCorporate() {
      return corporate;
   }
   public void setCorporate(String corporate) {
      this.corporate = corporate;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getPort() {
      return port;
   }
   public void setPort(int port) {
      this.port = port;
   }
   public Object clone() throws CloneNotSupportedException {
      return super.clone();
   }
   public String toString() {
      return "[Corporate=" + getCorporate() + ",Name=" + getName() + ",Port=" + getPort() + "]";
   }
}