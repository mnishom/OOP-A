package inheritas;

import java.awt.Color;
import javax.swing.JLabel;


public class MainData {
    public static void main(String[] args) {
        UserData user = new UserData();
        user.setTitle("User Data");
        user.setSize(400, 400);
        user.setLocationRelativeTo(null); 
        
        user.setId(1);
        
        
        JLabel L = new JLabel();
        L.setText(""+user.getId()); 
        L.setOpaque(true); 
        L.setBackground(Color.red); 
        L.setForeground(Color.WHITE); 
        user.add(L);
        
        user.setVisible(true); 
        
        System.out.println(user.getId());
        
    }
}
