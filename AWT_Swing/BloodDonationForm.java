import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BloodDonationForm extends Frame implements ActionListener {
    // Text fields
    TextField nameField, ageField, bloodGroupField, lastDonationField;
    
    // Checkbox
    Checkbox readyToDonateCheckbox;
    
    // Submit button
    Button submitButton;

    public BloodDonationForm() {
        // Frame setup
        setTitle("Blood Donation Form");
        setSize(270, 300);
        setLayout(new FlowLayout());
        
        // Label and Text Field for Name
        Label nameLabel = new Label("Name:");
        nameField = new TextField(20);
        
        // Label and Text Field for Age
        Label ageLabel = new Label("Age:");
        ageField = new TextField(5);
        
        // Label and Text Field for Blood Group
        Label bloodGroupLabel = new Label("Blood Group:");
        bloodGroupField = new TextField(5);
        
        // Label and Text Field for Last Donation Date
        Label lastDonationLabel = new Label("Last Donation Date:");
        lastDonationField = new TextField(10);
        
        // Checkbox for Ready to Donate
        readyToDonateCheckbox = new Checkbox("Ready to Donate");
        
        // Submit Button
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        // Adding components to the frame
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(bloodGroupLabel);
        add(bloodGroupField);
        add(lastDonationLabel);
        add(lastDonationField);
        add(readyToDonateCheckbox);
        add(submitButton);

        // Event handling for closing the window
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submitButton) {
            // Process the form data
            String name = nameField.getText();
            String age = ageField.getText();
            String bloodGroup = bloodGroupField.getText();
            String lastDonationDate = lastDonationField.getText();
            boolean readyToDonate = readyToDonateCheckbox.getState();

            // Display the collected data
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Blood Group: " + bloodGroup);
            System.out.println("Last Donation Date: " + lastDonationDate);
            System.out.println("Ready to Donate: " + (readyToDonate ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        BloodDonationForm form = new BloodDonationForm();
        form.setVisible(true);
    }
}
