
import javax.swing.JOptionPane;

public class GroupSize {

        public static void main(String[] args) {
                /**
                 * part 1 = determine number of people per group depending on the amount of people.
                 * @author tsr2519
                 */
                int num1=0, num2=0;

                String numPeople = JOptionPane.showInputDialog("Enter the Number of People");
                num1 = Integer.parseInt(numPeople);
                if (num1 >= 3 && num1 <= 10){

                        int groupSize = (num1/3);
                        JOptionPane.showMessageDialog(null, "The number of People per group is " + groupSize);
                }

                else if (num1<3){
                        JOptionPane.showMessageDialog(null, "The number of People must be at least 3.");

                }
                else if (num1 > 10){
                        int groupSize = (num1/2);
                        JOptionPane.showMessageDialog(null, "The number of People per Group is " + groupSize);

                }

                /**
                 * part 2 = determine number of teams depending on the amount of players.
                 *
                 */

                String numPlayers = JOptionPane.showInputDialog("Enter the number of players");
                        num2 = Integer.parseInt(numPlayers);

                        if (num2>=11 && num2 <=55){
                                int numTeams = (num2/11);

                                JOptionPane.showMessageDialog(null,  "The number of Teams is " + numTeams);


                        }
                        else if (num2<11){
                                JOptionPane.showMessageDialog(null,  "Number of players must be at least 11, otherwise the Team Size will remain 1 and each individual will be their own team.");

                        }

        }


}
