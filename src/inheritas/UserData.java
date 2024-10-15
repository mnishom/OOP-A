package inheritas;

import javax.swing.JFrame;

public class UserData extends JFrame{
  private int id;
  private String name;

    public UserData() {
    }

    public UserData(int id, String name) {
        this.id = id;
        this.name = name;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName2() {
        return name;
    }

    public void setName2(String name) {
        this.name = name;
    }
  
    public void print(int a){
        
    }
    
    public void print(String a){
        
    }
    
    public void print(int a, String b){
        
    }
  
  
}
