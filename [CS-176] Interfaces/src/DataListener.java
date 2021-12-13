import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   An action listener that prints a message.
*/
public class DataListener implements ActionListener
{
   private String name;
   Measurable[] data;
   

   public DataListener(Measurable[] data,String dataName)
   {
      name = dataName;
      this.data = data; 
   }

   public void actionPerformed(ActionEvent event)
   {
	   MeasureableButtonTester.showData(data,name);
   }
}
