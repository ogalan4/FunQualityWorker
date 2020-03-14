package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
private JButton button=new JButton("Расчет");
private JTextField text=new JTextField("", 3);
private JLabel label=new JLabel("опишите себя");
private JRadioButton radio1=new JRadioButton("не согласен на переработки");
private JRadioButton radio2=new JRadioButton("согласен на переработки");
private JCheckBox check=new JCheckBox("зарплата не главное");
    private JLabel label2=new JLabel(" место работы по шкале от 1 до 3",2);
private JRadioButton rad1=new JRadioButton("1");
    private JRadioButton rad2=new JRadioButton("2");
    private JRadioButton rad3=new JRadioButton("3");
private JLabel emptLabel1=new JLabel("");
    private JLabel emptLabel2=new JLabel("           Оцените ваше предыдущее");
    private JLabel emptLabel3=new JLabel("");
public  Gui(){
    super("Какой ты сотрудник");
    this.setBounds(300,100,600,350);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    Container container=this.getContentPane();
    setLayout(new GridLayout(5,1,1,5));
    container.add(text);
    container.add(label);
    container.add(check);
        ButtonGroup group=new ButtonGroup();
    group.add(radio1);
    group.add(radio2);
    container.add(radio1);
    container.add(radio2);
    container.add(emptLabel3);
    radio1.setSelected(true);
container.add(emptLabel2);
    container.add(label2);
    container.add(emptLabel1);


    ButtonGroup group1=new ButtonGroup();
    rad3.setSelected(true);
    group1.add(rad1);
    group1.add(rad2);
    group1.add(rad3);


    container.add(rad1);
    container.add(rad2);
    container.add(rad3);

    container.add(button);
    button.addActionListener(new ButtonEventListener());
    }
    public class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] variant={"Ленивый", "Прогульщик", "Карьерист", "Конфликтный", "Алчный","Безответственный","Врун","Беда в коллективе", "Слабое звено", "Паразит","Угроза общества"};
            String[] variant2={"Дотошный","Невнимательный", "Ищете другую работу","Так себе","Бесполезный","Протиратель штанов", "Иррациональный","Тугосоображающий" };
            String[] variant3={"Трудолюбивый","Быстрообучаемый", "Коммуникабельный","Внимательный", "Перспективный","человек с большим будущим","Человек с большой буквы","Просто находка", "Подаете большие надежды","Настоящий профессионал","Лучший сотрудник в компании"};
            String[] variant4={"Может Вам поппытать счастья в другом месте?", "У Вас бесконечно отрицательный трудовой потенциал","Вам бы дома сидеть", "Вас и в дворники не возьмут","А работать вообще планируете?"};
            String[] variant5={"На счет вас надо подумать", "Вас трудно охарактеризовать", "У вас очень противоречивые качества","Вы среднестатистический сотрудник своей отрасли"};
            String[]variant6={"Вы хороший специалист - просите повышения ЗП","У вас задатки менеджера - ждите повышения","Лучшие компании мира ищут таких, как вы","Вы многого достигли, но это не предел, вы можете больше"};

            int varlength=variant.length;
            int varlength2=variant2.length;
            int varlength3=variant3.length;

            int varlength4=variant4.length;
            int varlength5=variant5.length;
            int varlength6=variant6.length;

            int rand1=(int)(Math.random()*varlength);
            int rand2=(int)(Math.random()*varlength2);
            int rand3=(int)(Math.random()*varlength3);
            int rand4=(int)(Math.random()*varlength4);
            int rand5=(int)(Math.random()*varlength5);
            int rand6=(int)(Math.random()*varlength6);

            String messege1="Вы "+variant[rand1];
            String messege2="Вы "+variant2[rand2];
            String messege3="Вы "+variant3[rand3];
            String messege4=variant4[rand4];
            String messege5=variant5[rand5];
            String messege6=variant6[rand6];

            String mes="Вы ничего не выбрали";
            String chartext=text.getText();
            char[] ch=chartext.toCharArray();
            if (check.isSelected()&ch.length>15&radio2.isSelected()) {
                JOptionPane.showMessageDialog(null, messege3, "результат", JOptionPane.PLAIN_MESSAGE);
                if(rad3.isSelected()){JOptionPane.showMessageDialog(null,messege6, "результат",JOptionPane.PLAIN_MESSAGE);}
            }
            else
                if (check.isSelected() & ch.length > 10 || radio2.isSelected() & ch.length > 10||radio2.isSelected()&check.isSelected()) {
                    JOptionPane.showMessageDialog(null, messege2, "рузультат", JOptionPane.PLAIN_MESSAGE);
                if (rad2.isSelected()){JOptionPane.showMessageDialog(null,messege5,"результат",JOptionPane.PLAIN_MESSAGE);}
                }
                else
                    if (check.isSelected() || radio2.isSelected() || ch.length > 0) {
                        JOptionPane.showMessageDialog(null, messege1, "результат", JOptionPane.PLAIN_MESSAGE);
                    if(rad1.isSelected()){JOptionPane.showMessageDialog(null,messege4,"результат",JOptionPane.PLAIN_MESSAGE);}
                    }
                    else
                        JOptionPane.showMessageDialog(null, mes, "output", JOptionPane.PLAIN_MESSAGE);

                    }
                }
            }