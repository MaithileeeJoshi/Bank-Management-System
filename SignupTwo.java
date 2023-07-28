package bank.managment.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

   
    JTextField panTextField, adharTextField;
    JButton next;
    JRadioButton syes, sno, other, eyes, eno;
    JComboBox religion, occupation, education, Category, income;
    String formno;

    SignupTwo(String formno) {
        this.formno=formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel sreligion = new JLabel("Religion:");
        sreligion.setFont(new Font("Raleway", Font.BOLD, 20));
        sreligion.setBounds(100, 140, 100, 30);
        add(sreligion);

        String valReligion[] = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel scategory = new JLabel("Category:");
        scategory.setFont(new Font("Raleway", Font.BOLD, 20));
        scategory.setBounds(100, 190, 200, 30);
        add(scategory);
        String valcategory[] = {"Open", "OBC", "SC", "NT", "Other"};
        Category = new JComboBox(valcategory);
        Category.setBounds(300, 190, 400, 30);
        Category.setBackground(Color.WHITE);
        add(Category);

        JLabel sincome = new JLabel("Income:");
        sincome.setFont(new Font("Raleway", Font.BOLD, 20));
        sincome.setBounds(100, 240, 200, 30);
        add(sincome);
        String incomecategory[] = {"Null", "Below 1 Lakh", "Below 5 Lakh", "Below 10 Lakh", "Above 15 Lakh"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel seducation = new JLabel("Qualification:");
        seducation.setFont(new Font("Raleway", Font.BOLD, 20));
        seducation.setBounds(100, 315, 200, 30);
        add(seducation);
        String educationalValues[] = {"12th-Pass", "Graduated", "Post Graduated", "Phd", "Doctorate", "Other"};
        education = new JComboBox(educationalValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel soccupation = new JLabel("Occupation:");
        soccupation.setFont(new Font("Raleway", Font.BOLD, 20));
        soccupation.setBounds(100, 390, 200, 30);
        add(soccupation);
        String occupationValues[] = {"Student", "Salaried", "Self-Employed", "Not Employed", "Bussiness", "Farmer", "Retiered", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel adhar = new JLabel("Aadhar Number:");
        adhar.setFont(new Font("Raleway", Font.BOLD, 20));
        adhar.setBounds(100, 490, 200, 30);
        add(adhar);

        adharTextField = new JTextField();
        adharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        adharTextField.setBounds(300, 490, 400, 30);
        add(adharTextField);

        JLabel seniorcitizen = new JLabel("Senior-Citizen");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorcitizen.setBounds(100, 540, 200, 30);
        add(seniorcitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup maritialgroup = new ButtonGroup();
        maritialgroup.add(syes);
        maritialgroup.add(sno);

        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccount.setBounds(100, 590, 200, 30);
        add(existingAccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup maritialsgroup = new ButtonGroup();
        maritialsgroup.add(eyes);
        maritialsgroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) Category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String saccount = (String) occupation.getSelectedItem();

        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existingAccount = null;
        if (eyes.isSelected()) {
            saccount = "Yes";
        } else if (eno.isSelected()) {
            saccount = "No";
        }

        String span = panTextField.getText();
        String sadhar = adharTextField.getText();

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" +scategory + "','" +sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + sadhar+ "','" + seniorcitizen + "','" + existingAccount + "')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupTwo(formno).setVisible(false);
            /*else if(fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father's Name is required" );
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null,"Date Of Birth is required" );
            }else if(gender.equals("")){
                JOptionPane.showMessageDialog(null,"Father's Name is required" );
            }else if(fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father's Name is required" );
            }*/
            
            //Signup 3 Object
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}
