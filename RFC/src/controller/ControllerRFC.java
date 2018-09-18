
package controller;
import model.ModelRFC;
import view.ViewRFC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerRFC implements ActionListener{

    private final ModelRFC modelRFC;
    private final ViewRFC viewRFC;
    
    public ControllerRFC (ModelRFC modelRFC, ViewRFC viewRFC){
        this.modelRFC = modelRFC;
        this.viewRFC = viewRFC;
        
        viewRFC.jb_calculate.addActionListener(this);
        initComponents();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewRFC.jb_calculate){
            calculateRFC();
        }
    }
    public void calculateRFC(){
            modelRFC.setNombre1(viewRFC.jtf_first_name.getText());
            modelRFC.setNombre2(viewRFC.jtf_second_name.getText());
            modelRFC.setApe_pat(viewRFC.jtf_ape_pat.getText());
            modelRFC.setApe_mat(viewRFC.jtf_ape_mat.getText());
            modelRFC.setYear(String.valueOf(viewRFC.jcb_year.getSelectedItem()));
            modelRFC.setMonth(String.valueOf(viewRFC.jcb_month.getSelectedItem()));
            modelRFC.setDay(String.valueOf(viewRFC.jcb_day.getSelectedItem()));
            if (modelRFC.getMonth() == "Enero"){
                modelRFC.setMonth("01");
            }
            else if (modelRFC.getMonth() == "Febrero"){
                modelRFC.setMonth("02");
            }
            else if (modelRFC.getMonth() == "Marzo"){
                modelRFC.setMonth("03");
            }
            else if (modelRFC.getMonth() == "Abril"){
                modelRFC.setMonth("04");
            }
            else if (modelRFC.getMonth() == "Mayo"){
                modelRFC.setMonth("05");
            }
            else if (modelRFC.getMonth() == "Junio"){
                modelRFC.setMonth("06");
            }
            else if (modelRFC.getMonth() == "Julio"){
                modelRFC.setMonth("07");
            }
            else if (modelRFC.getMonth() == "Agosto"){
                modelRFC.setMonth("08");
            }
            else if (modelRFC.getMonth() == "Septiembre"){
                modelRFC.setMonth("09");
            }
            else if (modelRFC.getMonth() == "Octubre"){
                modelRFC.setMonth("10");
            }
            else if (modelRFC.getMonth() == "Noviembre"){
                modelRFC.setMonth("11");
            }
            else if (modelRFC.getMonth() == "Diciembre"){
                modelRFC.setMonth("12");
            }
            
            JOptionPane.showMessageDialog(null, "Tu RFC es : " + modelRFC.resultRFC());
        }
    public void initComponents(){
        viewRFC.setLocationRelativeTo(null);
        viewRFC.setTitle("Calcular RFC");
        viewRFC.setVisible(true);
    }
    
}
