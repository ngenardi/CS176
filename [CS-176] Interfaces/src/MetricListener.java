import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   An action listener that prints a message.
*/
public class MetricListener implements ActionListener
{
   private String name;

   public MetricListener(String theName)
   {
      name = theName;
   }

   public void actionPerformed(ActionEvent event)
   {
	   MeasureableButtonTester.setMetric(name);
   }
}
